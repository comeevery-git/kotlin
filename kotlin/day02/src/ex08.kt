/*
*
* 단항연산자 : 피연산자가 하나
*               항
*   +(x +1), -(x -1), ! (not), boolean type
*/

fun main() {
    val b1:Boolean = true
    val b2:Boolean = false

    val b3:Boolean = !b1
    val b4:Boolean = !b2

    println(b1)
    println(b2)
    println(b3)
    println(b4)

    // 증가 연산자, 감소 연산자
    // 증감 연산자
    var num1:Int = 10
    var num2:Int = 10
    println(num1)
    println(num2)

    val num3:Int = num1++
    val num4:Int = num2--
    println(num3)
    println(num4)

    val num5:Int = ++num1
    val num6:Int = --num2
    println(num5)
    println(num6)

}