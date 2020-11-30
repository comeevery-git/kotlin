package com.tjoeun.kotlin.generic

fun main() {
    val test1_1 = Test1()
    test1_1.test1Method(111)
    val test2_1 = Test2<Int>()
    val test2_2 = Test2<String>()
    test2_1.test2Method(111)
    test2_2.test2Method("hi")

    val test3 = Test3<Int>(111)
    test3.test3Method(222)

    val test4 = Test4<Int, String>()
    test4.test4Method(222, "222")

    val test5 =Test5<Int, Double, String, Boolean>(111, 111.111)
    test5.test5Method("String", true)
}

class Test1() {
    fun test1Method(n1: Int) {
        println("n1: $n1")
    }
}
class Test2<T>() {
    fun test2Method(n2: T) {
        println("n2: $n2")
    }
}
class Test3<T>(var n1: T) {
    fun test3Method(n2: T) {
        println("n1: $n1")
        println("n2: $n2")
    }
}

class Test4<T, E>() {
    fun test4Method(n1: T, n2: E) {
        println("n1: $n1")
        println("n2: $n2")
    }
}

class Test5<T, E, M, P>(var n1: T, var n2: E ) {
    fun test5Method(n3: M, n4: P) {
        println("n1: $n1")
        println("n2: $n2")
        println("n2: $n3")
        println("n2: $n4")

    }
}