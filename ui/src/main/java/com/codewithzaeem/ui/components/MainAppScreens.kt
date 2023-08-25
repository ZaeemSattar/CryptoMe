package com.codewithzaeem.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.codewithzaeem.ui.navigation.Navigation

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainAppScreens(onDrawerIconClick: () ->Unit, navController: NavHostController) {

    Scaffold(topBar = {
        TopBarHome {
            onDrawerIconClick()
        }
    }, bottomBar = {

        BottomNavigation(navController)

    }) { innerPadding ->

        Navigation(navController, Modifier.padding(paddingValues = innerPadding))

    }
}