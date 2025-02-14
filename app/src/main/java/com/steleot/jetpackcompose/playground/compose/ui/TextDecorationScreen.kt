package com.steleot.jetpackcompose.playground.compose.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.steleot.jetpackcompose.playground.compose.reusable.DefaultScaffold
import com.steleot.jetpackcompose.playground.navigation.UiNavRoutes

private const val Url = "ui/TextDecorationScreen.kt"

@Composable
fun TextDecorationScreen() {
    DefaultScaffold(
        title = UiNavRoutes.TextDecoration,
        link = Url,
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = "Line Through text",
                textDecoration = TextDecoration.LineThrough
            )
            Text(
                text = "UnderLine text",
                textDecoration = TextDecoration.Underline
            )
            Text(
                text = "UnderLine + Line Through text",
                textDecoration = TextDecoration.Underline + TextDecoration.LineThrough
            )
        }
    }
}