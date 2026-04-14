package com.betanooblabs.composemultiplatformproject.dependencies

interface MyRepository {
    fun helloWorld(): String
}

class MyRepositoryImpl(
    private val dbClient: DBclient
) : MyRepository {
    override fun helloWorld(): String {
        return "Hello World!"
    }
}