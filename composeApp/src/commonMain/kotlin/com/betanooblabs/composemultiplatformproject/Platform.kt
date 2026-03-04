package com.betanooblabs.composemultiplatformproject

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform