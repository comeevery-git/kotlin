fun main() {
    var result:Int = test(33, 55) //argument : input
    println("result : $result")

    result = addTest(555, 777)
    println("result : $result")

}

fun addTest(n1:Int,n2:Int):Int { // parameter : input
    var n3:Int = n1+n2
    return n3
}

fun test(n1:Int,n2:Int):Int { // parameter : input
                        // return 값의 타입
    return 1234 // return 값
}

