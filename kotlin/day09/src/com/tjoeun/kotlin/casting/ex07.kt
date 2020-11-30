package com.tjoeun.kotlin.casting

fun main() {
    val cp1: ChildP = ChildP()
    val ci1: ChildI = ChildI()

    val pr1: Parent1 = cp1
    val it1: Inter1 = ci1

    val ip = Point()
    val a = A()

    // class : type : 접근권한
    // 부모 타입의 참조변수로 자식 타입의 멤버에 접근할 수 있는 권한 부
    pr1 as ChildP
    it1 as ChildI

    pr1.ChildPMethod()

    val cp2: ChildP = ChildP()

    val existParent1 = cp2 is Parent1
    println("existParent1: $existParent1")

    val pr2: Parent1 = cp2
    val existParent1_2 = pr2 is ChildP
    println("existParent1_2: $existParent1_2")
    if (pr2 is ChildP) {
        pr2.ChildPMethod()
    }

    val existInter1 = ci1 is Inter1
    println("existInter1: $existInter1")

    val obj1: ChildP = ChildP()
    val obj2: ChildI = ChildI()
    anyMethod(obj1)
    anyMethod(obj2)
    anyMethod(33)
    anyMethod("33")

    val str: String = "7777"
    val num: Int = str.toInt()
    println("str = $str")
    println("num = $num")


}

open class Parent1
interface Inter1
class ChildP: Parent1() {
    fun ChildPMethod() {
        println("ChildP의 ChildPMethod")
    }
}
class ChildI: Inter1 {
    fun ChildIMethod() {
        println("ChildI의 ChildIMethod")
    }
}
class A {
    val a: Int = 222
}
open class Point() {
    var x = 100
    var y = 100
}

class Circle: Point() {
    val z:Int = 300
}

fun anyMethod(obj: Any) {
    if (obj is ChildP) {
        obj.ChildPMethod()
    }
    else if (obj is ChildI) {
        obj.ChildIMethod()
    }
    else if (obj is Int) {
        println("This type is Int")
    }
    else if (obj is String) {
        println("This type is String")
    }
    else {
        println("Can Not Found Method")
    }
}
