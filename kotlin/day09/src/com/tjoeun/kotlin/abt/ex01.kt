package com.tjoeun.kotlin.abt

fun main() {
    val chd1 = Child1()
    chd1.abstract1Method()
    val chd2 = Child2()
    chd2.inter1Method()

    val chd1_2 = object : Absctact1() {
        override fun abstract1Method() {
            println("chd1_2 = object : Absctact1(), override fun abstract1Method() {")
        }
    }
    chd1_2.abstract1Method()

    val chd2_2 = object : Inter1 {
        override fun inter1Method() {
            println("chd2_2 = object : Inter1, inter1Method")
        }
    }
    chd2_2.inter1Method()
}
abstract class Absctact1 {
    abstract fun abstract1Method()
}
interface Inter1 {
    fun inter1Method()
}
class Child1: Absctact1() {
    override fun abstract1Method() {
        println("Child1 abstract1Method")
    }
}
class Child2: Inter1 {
    override fun inter1Method() {
        println("Child2 inter1Method")
    }
}