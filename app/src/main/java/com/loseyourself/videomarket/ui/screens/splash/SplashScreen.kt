package com.loseyourself.videomarket.ui.screens.splash

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


//for compose, it's good to have previews
@Preview
@Composable
private fun preview(){
    SplashScreen(navController = rememberNavController())
}
@Composable
fun SplashScreen(navController: NavController) {

    Box(modifier = Modifier
        .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text("VideoMarketApp")
    }
}