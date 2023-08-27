package com.codewithzaeem.ui.screen.home

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import com.codewithzaeem.ui.viewmodel.HomeViewModel

@Composable
fun HomeScreen(homeViewModel: HomeViewModel = hiltViewModel()) {


    val state by homeViewModel.state.collectAsState()

    LazyColumn(content = {

        items(state.assets) {

            Text(text = it.name)
        }

    })

}