package com.andro.stevanimmanuelsimbolon_124140130

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "StevanImmanuelSimbolon_124140130",
    ) {
        App()
    }
}