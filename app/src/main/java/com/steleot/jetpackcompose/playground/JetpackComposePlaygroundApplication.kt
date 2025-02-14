package com.steleot.jetpackcompose.playground

import android.app.Application
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.crashlytics.FirebaseCrashlytics
import com.google.firebase.messaging.FirebaseMessaging
import com.steleot.jetpackcompose.playground.datastore.ProtoManager
import com.steleot.jetpackcompose.playground.helpers.InAppReviewHelper
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltAndroidApp
class JetpackComposePlaygroundApplication : Application() {

    private val scope = CoroutineScope(Dispatchers.Main)

    @Inject
    lateinit var inAppReviewHelper: InAppReviewHelper

    @Inject
    lateinit var firebaseAnalytics: FirebaseAnalytics

    @Inject
    lateinit var firebaseMessaging: FirebaseMessaging

    @Inject
    lateinit var firebaseCrashlytics: FirebaseCrashlytics

    @Inject
    lateinit var protoManager: ProtoManager

    override fun onCreate() {
        super.onCreate()
        inAppReviewHelper.resetCounter()
        scope.launch {
            protoManager.isAnalyticsEnabled.collect { isEnabled ->
                Timber.d("Analytics collection: $isEnabled")
                firebaseAnalytics.setAnalyticsCollectionEnabled(isEnabled)
            }
        }
        scope.launch {
            protoManager.isMessagingEnabled.collect { isEnabled ->
                Timber.d("Messaging: $isEnabled")
                firebaseMessaging.isAutoInitEnabled = isEnabled
            }
        }
        scope.launch {
            protoManager.isCrashlyticsEnabled.collect { isEnabled ->
                Timber.d("Crashlytics collection: $isEnabled")
                firebaseCrashlytics.setCrashlyticsCollectionEnabled(isEnabled)
            }
        }
    }
}