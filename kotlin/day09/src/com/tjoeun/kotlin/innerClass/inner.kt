package com.tjoeun.kotlin.innerClass

fun main() {
    // Outer1이 생성되어있지 않아 오류 발생
    // Outer1.Inner1()

    val outer1_1 = Outer1()
    val inner1_1 = outer1_1.Inner1()

    println("outer1_1.outerNum1: ${outer1_1.outerNum1}")
    outer1_1.outer1Method()

    println("inner1_1.outerNum1: ${inner1_1.innerNum1}")
    inner1_1.inner1Method1()
    inner1_1.inner1Method2()
}

class Outer1() {
    val outerNum1 = 111
    fun outer1Method() {
        println("outer1Method()")

        val inter1_1 = Inner1()
        println("inter1_1 val num: ${inter1_1.innerNum1}")
        inter1_1.inner1Method1()
    }
    inner class Inner1() {
        val innerNum1 = 111
        fun inner1Method1() {
            println("inner1Method()1")
        }
        fun inner1Method2() {
            println("inner1Method()2")
            println("outerNum1: $outerNum1")
            outer1Method()
        }
    }
}