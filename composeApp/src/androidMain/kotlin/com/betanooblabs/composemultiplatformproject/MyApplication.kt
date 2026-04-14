package com.betanooblabs.composemultiplatformproject

import android.app.Application
import com.betanooblabs.composemultiplatformproject.di.initKoin
import org.koin.android.ext.koin.androidContext

class MyApplication: Application(){
    override fun onCreate() {
        super.onCreate()
        initKoin{
            androidContext(this@MyApplication)
        }
    }
}