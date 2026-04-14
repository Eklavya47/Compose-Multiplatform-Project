package com.betanooblabs.composemultiplatformproject

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.betanooblabs.composemultiplatformproject.di.initKoin

fun main(): () -> Unit = {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "ComposeMultiplatformProject",
        ) {
            App()
        }
    }
}