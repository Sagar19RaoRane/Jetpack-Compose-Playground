package com.steleot.jetpackcompose.playground.compose.externallibraries

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.google.accompanist.placeholder.PlaceholderHighlight
import com.google.accompanist.placeholder.material.fade
import com.google.accompanist.placeholder.material.placeholder
import com.google.accompanist.placeholder.material.shimmer
import com.steleot.jetpackcompose.playground.compose.reusable.DefaultScaffold
import com.steleot.jetpackcompose.playground.navigation.ExternalLibrariesNavRoutes
import kotlinx.coroutines.delay

private const val Url = "externallibraries/PlaceholderAccompanistScreen.kt"

@Composable
fun PlaceholderAccompanistScreen() {
    DefaultScaffold(
        title = ExternalLibrariesNavRoutes.PlaceholderAccompanist,
        link = Url,
    ) {
        var isLoading by remember { mutableStateOf(true) }
        LaunchedEffect(isLoading) {
            if (isLoading) {
                delay(5_000)
                isLoading = false
            }
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            PlaceholderItemExample(
                "Jetpack Compose",
                childModifier = Modifier.placeholder(visible = isLoading)
            )
            PlaceholderItemExample(
                "Jetpack Compose",
                childModifier = Modifier.placeholder(
                    visible = isLoading,
                    color = Color.Gray,
                    highlight = PlaceholderHighlight.fade(),
                )
            )
            PlaceholderItemExample(
                "Jetpack Compose",
                childModifier = Modifier.placeholder(
                    visible = isLoading,
                    color = Color.Gray,
                    highlight = PlaceholderHighlight.shimmer(progressForMaxAlpha = 0.5f),
                )
            )
        }
    }
}

@OptIn(ExperimentalCoilApi::class)
@Composable
private fun PlaceholderItemExample(
    text: String,
    modifier: Modifier = Modifier,
    painter: Painter = rememberImagePainter(randomSampleImageUrl()),
    childModifier: Modifier = Modifier,
) {
    Row(modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
        Image(
            painter = painter,
            contentDescription = null,
            modifier = childModifier
                .size(64.dp)
                .clip(RoundedCornerShape(4.dp)),
        )

        Spacer(Modifier.width(16.dp))

        Text(
            text = text,
            style = MaterialTheme.typography.subtitle2,
            modifier = childModifier
                .weight(1f)
                .align(Alignment.CenterVertically)
        )
    }
}