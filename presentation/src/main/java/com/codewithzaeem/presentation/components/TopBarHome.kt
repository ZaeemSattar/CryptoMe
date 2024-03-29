package com.codewithzaeem.presentation.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextOverflow


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarHome(onDrawerIconClick: () ->Unit) {

    CenterAlignedTopAppBar(title = {
        Text(
            "Centered TopAppBar", maxLines = 1, overflow = TextOverflow.Ellipsis
        )
    }, navigationIcon = {
        IconButton(onClick = { onDrawerIconClick.invoke() }) {
            Icon(
                imageVector = Icons.Filled.Menu, contentDescription = "Localized description"
            )
        }
    }, actions = {
        IconButton(onClick = { /* doSomething() */ }) {
            Icon(
                imageVector = Icons.Filled.Favorite,
                contentDescription = "Localized description"
            )
        }
    })
}