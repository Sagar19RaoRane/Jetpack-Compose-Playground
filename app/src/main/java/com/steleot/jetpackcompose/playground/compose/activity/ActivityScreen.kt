package com.steleot.jetpackcompose.playground.compose.activity

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.steleot.jetpackcompose.playground.compose.rest.MainScreen
import com.steleot.jetpackcompose.playground.navigation.ActivityNavRoutes
import com.steleot.jetpackcompose.playground.navigation.MainNavRoutes

val routes = listOf(
    ActivityNavRoutes.BackHandler,
    ActivityNavRoutes.LauncherForActivityResult1,
    ActivityNavRoutes.LauncherForActivityResult2,
)

@Composable
fun ActivityScreen(navController: NavHostController) {
    MainScreen(
        navController = navController,
        title = MainNavRoutes.Activity,
        list = routes,
    )
}
