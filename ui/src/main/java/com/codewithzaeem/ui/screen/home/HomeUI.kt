package com.codewithzaeem.ui.screen.home

import com.codewithzaeem.core.entity.Asset

data class HomeUI(
    val isLoading: Boolean = false, val assets: List<Asset> = emptyList(), val error: String = ""
)