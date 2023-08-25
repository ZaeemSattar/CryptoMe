package com.codewithzaeem.ui.screens

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.codewithzaeem.ui.components.NavigationDrawer

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainApp() {

    val navController = rememberNavController()

    NavigationDrawer(navController = navController)


}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainApp()

}