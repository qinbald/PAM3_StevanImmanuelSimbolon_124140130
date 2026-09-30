package com.andro.stevanimmanuelsimbolon_124140130

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return sayHello(platform.name)
    }
}