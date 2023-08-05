package com.codewithzaeem.cryptome.navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.codewithzaeem.cryptome.R


val items = listOf(
    Screen.Home,
    Screen.Profile,
)


sealed class Screen(val route: String, @StringRes val resourceId: Int, @DrawableRes val icon: Int) {
    object Home : Screen("home", R.string.home, R.drawable.ic_home)
    object Profile : Screen("profile", R.string.profile, R.drawable.ic_home)
}
