package com.codewithzaeem.cryptome.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.codewithzaeem.cryptome.screens.HomeScreen
import com.codewithzaeem.cryptome.screens.ProfileScreen

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