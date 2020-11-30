package com.tjoeun.kotlin.nullHandling

fun main() {
    test1Fun("hi! kotlin.")
    test2Fun(null)
    test3Fun("hi! kotlin.")
    test3Fun(null)
}

fun test1Fun(str: String?) {
    val value: String = str!!
    println("value: $value")
}

fun test2Fun(str: String?) {
    val value: String = str?: "default"
    println("value: $value")
}

fun test3Fun(str: String?) {
    println("str: $str")
    println("str length: ${str?.length}")
}