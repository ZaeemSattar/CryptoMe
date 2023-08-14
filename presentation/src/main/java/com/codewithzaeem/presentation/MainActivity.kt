package com.codewithzaeem.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.codewithzaeem.presentation.screens.MainApp
import com.codewithzaeem.presentation.theme.CryptoMeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CryptoMeTheme {

                MainApp()
                

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CryptoMeTheme {

        MainApp()
    }
}