/*
    null 허용 변수
    kotlin 은 변수를 선언할 때
    null 허용 여부를 설정할 수 있음.

    var(val) 변수이름 : 자료형 = 값 -> null을 허용하지 않음
    var(val) 변수이름 : 자료형? = 값 -> null을 허용함

*/

fun main() {
//    var num1:Int = null
    var num2:Int? = null

//    println("num1 : ${num1}")
    println("num2 : ${num2}")

    var num3:Int? = num2

    println("$num3")

    

}