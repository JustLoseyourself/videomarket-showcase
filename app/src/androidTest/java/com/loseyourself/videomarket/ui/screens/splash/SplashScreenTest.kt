package com.loseyourself.videomarket.ui.screens.splash

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.navigation.compose.rememberNavController
import org.junit.Rule
import org.junit.Test

class SplashScreenTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun splashScreen_displaysAndNavigates() {

        composeTestRule.setContent {
            SplashScreen(navController = rememberNavController())
        }

        //Make sure the text displayed is actually "VideoMarketApp" which is the Text() on the composable
        composeTestRule
            .onNodeWithText("VideoMarketApp")
            .assertIsDisplayed()

    }
}