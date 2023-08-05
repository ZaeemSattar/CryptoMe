package com.codewithzaeem.cryptome

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.codewithzaeem.cryptome.navigation.MainScreen
import com.codewithzaeem.cryptome.ui.theme.CryptoMeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CryptoMeTheme {

                MainScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CryptoMeTheme {

        MainScreen()
    }
}