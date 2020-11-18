/*
    return : 함수의 결과값을 돌려줌
            함수를 종료함
            해당 함수를 호출한 곳으로 돌아감
*/

fun main() {
    val result1 = testFunc1(100)
    println("result1 : ${result1}")

    val result2 = testFunc2(0)
    println("result2 : ${result2}")

}

fun testFunc1(num:Int):Int{
    println("testFunc1() 함수")
    return num + 100
}

fun testFunc2(num:Int):Int{
    println("testFunc2() 함수")
    if(num == 0) return -1
    return 100 / num
}