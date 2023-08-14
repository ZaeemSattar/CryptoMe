package com.codewithzaeem.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.codewithzaeem.presentation.screens.HomeScreen
import com.codewithzaeem.presentation.screens.ProfileScreen

@Composable
fun Navigation(navController: NavHostController, modifier: Modifier = Modifier) {

    NavHost(
        navController, startDestination = Screen.Home.route, modifier
    ) {
        composable(Screen.Home.route) {
            HomeScreen()
        }
        composable(Screen.Profile.route) {
            ProfileScreen()

        }
    }

}