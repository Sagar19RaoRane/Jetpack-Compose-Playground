package com.steleot.jetpackcompose.playground

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.steleot.jetpackcompose.playground.compose.reusable.DefaultListItem
import com.steleot.jetpackcompose.playground.navigation.MainNavRoutes

private val routes = listOf(
    MainNavRoutes.Foundation,
    MainNavRoutes.Material,
)

@Composable
fun MainScreen(
    navController: NavHostController,
    list: List<String> = routes,
) {
    Column(
        modifier = androidx.compose.ui.Modifier
            .verticalScroll(rememberScrollState())
    ) {
        list.forEach { item ->
            DefaultListItem(
                text = item,
                modifier = Modifier.fillMaxWidth()
            ) {
                navController.navigate(item)
            }
        }
    }
}