package com.betanooblabs.composemultiplatformproject.di

import com.betanooblabs.composemultiplatformproject.dependencies.DBclient
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

actual val platformModule = module{
    singleOf(::DBclient)
}