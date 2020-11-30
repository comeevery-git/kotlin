package com.tjoeun.kotlin.NullSafeCasting

fun main() {
    test1Methid("1234")
    test1Methid(null)
    println("=========")
    test2Methid("1234")
    test2Methid(null)
}

fun test1Methid(str: String?) {
    if (str is String) {
        // smart casting
        println(str?.length)
    }


    else if (str !== null) {
        println(str.length)
    }
    //    println(str?.length)
}

fun test2Methid(str: Any?) {
    if (str is String) {
        // smart casting
        println(str.length)
    }
    else if (str !== null) {
        // null을 허용하지 않는 타입인 것은 맞으나
        // String 타ㅣ입의 객체으,ㅣ 주소가 들어오지 않았으므로
        // length 속성 사용 불가
        println("str: $str")
    }
}