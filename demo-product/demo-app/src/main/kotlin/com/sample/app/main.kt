package com.sample.app

import com.sample.features.one.One

fun main() {
    val impl = One { println("Demo app") }
    impl.action()
}
