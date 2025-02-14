object AppDependencies {

    val project = listOf(
        ":base"
    )

    val bom = listOf(
        Libraries.firebaseBom,
        Libraries.okhttpBom,
    )

    val implemention = listOf(
        Libraries.composeAnimation,
        Libraries.composeAnimationGraphics,
        Libraries.composeCompiler,
        Libraries.composeFoundation,
        Libraries.composeMaterial,
        Libraries.composeMaterialIcons,
        Libraries.composeRuntime,
        Libraries.composeLiveData,
        Libraries.composeUi,
        Libraries.composeUiUtil,
        Libraries.composeUiTooling,
        Libraries.navigation,
        Libraries.composeConstraint,
        Libraries.composePaging,
        Libraries.composeActivity,
        Libraries.appCompat,
        Libraries.viewModel,
        Libraries.firebaseAnalytics,
        Libraries.firebaseCrashlytics,
        Libraries.firebaseFirestore,
        Libraries.firebaseMessaging,
        Libraries.firebaseInstallations,
        Libraries.hilt,
        Libraries.hiltNavigation,
        Libraries.startUp,
        Libraries.coroutines,
        Libraries.coroutinesAndroid,
        Libraries.coroutinesPlayServices,
        Libraries.dataStore,
        Libraries.protobufJavaLite,
        Libraries.playCore,
        Libraries.playCoreKtx,
        Libraries.cameraxCore,
        Libraries.camerax2,
        Libraries.cameraxLifecycle,
        Libraries.cameraxView,
        Libraries.workManager,
        Libraries.retrofit,
        Libraries.okhttp,
        Libraries.okhttpLogging,
        Libraries.kotlinxSerializationConverter,
        Libraries.kotlinxSerialization,
        Libraries.accompanistInsets,
        Libraries.accompanistFlow,
        Libraries.accompanistPager,
        Libraries.accompanistPagerIndicators,
        Libraries.accompanistSystemuicontroller,
        Libraries.accompanistSwipeRefresh,
        Libraries.accompanistPermissions,
        Libraries.accompanistPlaceholderMaterial,
        Libraries.accompanistDrawablePainter,
        Libraries.accompanistNavigationAnimation,
        Libraries.accompanistNavigationMaterial,
        Libraries.landscapistCoil,
        Libraries.landscapistGlide,
        Libraries.landscapistFresco,
        Libraries.orchestraBalloon,
        Libraries.orchestraColorPicker,
//        Libraries.orchestraSpinner,
        Libraries.coil,
        Libraries.coilCompose,
        Libraries.glide,
        Libraries.fresco,
        Libraries.timber,
        Libraries.lottie,
        Libraries.ratingBar,
        Libraries.revealSwipe,
        Libraries.speedDial,
        Libraries.fontAwesome,
        Libraries.composeCharts,
        Libraries.composeNeumorphism,
        Libraries.composeMarkdown,
        Libraries.composeBarcodes,
        Libraries.composeRichtextUi,
        Libraries.composeRichtextUiMaterial,
        Libraries.composeRichtextPrinting,
//        Libraries.composeRichtextSlideshow,
//        Libraries.zoomableImage,
        Libraries.stageStepBar,
        Libraries.plot,
        Libraries.composeTimelineView,
        Libraries.adMob,
    )

    val kapt = listOf(
        Libraries.hiltCompiler,
        Libraries.glideCompiler,
    )

    val debug = listOf(
        Libraries.kotlinReflect
    )

    val androidTest = listOf(
        TestLibraries.composeUi,
        TestLibraries.composeUiJunit,
        TestLibraries.testCore,
    )
}