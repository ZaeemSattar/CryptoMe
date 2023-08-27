package com.codewithzaeem.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.codewithzaeem.ui.screen.home.HomeScreen
import com.codewithzaeem.ui.screen.ProfileScreen

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