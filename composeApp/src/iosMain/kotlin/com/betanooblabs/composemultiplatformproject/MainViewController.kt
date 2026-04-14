package com.betanooblabs.composemultiplatformproject

import androidx.compose.ui.window.ComposeUIViewController
import com.betanooblabs.composemultiplatformproject.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) { App() }