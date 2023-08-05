package com.codewithzaeem.cryptome.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.codewithzaeem.cryptome.components.BottomNavigation
import com.codewithzaeem.cryptome.navigation.Navigation

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {

    val navController = rememberNavController()

    Scaffold(bottomBar = {

        BottomNavigation(navController)

    }) { innerPadding ->

        Navigation(navController, Modifier.padding(paddingValues = innerPadding))

    }


}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen()

}