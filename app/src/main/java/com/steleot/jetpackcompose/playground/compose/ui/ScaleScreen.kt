package com.steleot.jetpackcompose.playground.compose.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.steleot.jetpackcompose.playground.compose.reusable.DefaultScaffold
import com.steleot.jetpackcompose.playground.navigation.UiNavRoutes

private const val Url = "ui/ScaleScreen.kt"

@Composable
fun ScaleScreen() {
    DefaultScaffold(
        title = UiNavRoutes.Scale,
        link = Url,
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                Modifier
                    .scale(2f)
                    .size(100.dp, 100.dp)
                    .background(Color.Red)
            )
            Box(
                Modifier
                    .scale(scaleX = 2f, scaleY = 3f)
                    .size(100.dp, 100.dp)
                    .background(Color.Blue)
            )
        }
    }
}