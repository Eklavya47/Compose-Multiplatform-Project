package com.betanooblabs.composemultiplatformproject.di

import com.betanooblabs.composemultiplatformproject.dependencies.MyRepository
import com.betanooblabs.composemultiplatformproject.dependencies.MyRepositoryImpl
import com.betanooblabs.composemultiplatformproject.dependencies.MyViewModel
import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module

val sharedModule = module{
    singleOf(::MyRepositoryImpl).bind<MyRepository>()
    viewModelOf(::MyViewModel)
}