package com.steleot.jetpackcompose.playground.compose.foundation

import androidx.compose.runtime.Composable
import com.steleot.jetpackcompose.playground.FoundationNavRoutes
import com.steleot.jetpackcompose.playground.compose.reusable.DefaultScaffold
import java.util.*

@Composable
fun FocusableScreen() {
    DefaultScaffold(
        title = FoundationNavRoutes.Focusable.capitalize(Locale.getDefault())
    ) {

    }
}