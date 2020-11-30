package com.tjoeun.kotlin.generic

fun main() {
    // 불변성
    // 객체의 타입이 같으면서 지정한 Generic도 같아야한다.
//                val test6_1 = Test6<Child1> = Test6<Child1>()
//    val test6_2 = Test6<GrandChild1> = Test6<Child1>()
//    val test6_3 = Test6<Parent1> = Test6<Child1>()

    // 공변성
    // 객체의 타입이 같은경우 객체를 생성할 때 지정한 Generic보다
    // 부모 type의 Generic에 설정된 type의 변수에도 주소를 할당할 수 있음
//            val test7_1 = Test7<Child1> = Test7<Child1>()
//    val test7_2 = Test7<GrandChild1> = Test7<Child1>()
//            val test7_3 = Test7<Parent1> = Test7<Child1>()

    // 반 공변성
    // 객체의 타입이 같은경우 객체를 생성할 때 지정한 Generic보다
    // 자식 type의 Generic에 설정된 type의 변수에도 주소를 할당할 수 있음
//            val test8_1 = Test8<Child1> = Test8<Child1>()
//            val test8_2 = Test8<GrandChild1> = Test8<Child1>()
//    val test8_3 = Test8<Parent1> = Test8<Child1>()

}

open class Parent1() {

}

open class Child1(): Parent1() {

}

class GrandChild1: Child1()

// a 불변성
class Test6<T>() {

}

// a 공변성
class Test7<out T>() {

}

// a 반 공변성
class Test8<in T>() {

}