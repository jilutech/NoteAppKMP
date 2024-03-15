package com.example.noteappkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform