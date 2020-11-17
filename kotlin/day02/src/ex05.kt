// overloading
/*
    같은 이름의 함수를 정의하면서
    매개변수부를 다르게 해서
    중복 에러가 발생하지 않게 하는 문법

*/

fun test4(num: Int){
    if (num < 100) {
        test4(num + 1)
    }
    println(num)
}


fun main() {
    var num1:Int = 100
    num1 = 200

    test4(1)

    var result:Int = 0
    var resultD:Double = 0.0
    result = add()
    println("result : $result")

    result = add(33,55)
    println("result : $result")

    resultD = add(33,55.55)
    println("resultD : $resultD")

    resultD = add(33.5555,55)
    println("resultD : $resultD")

}

fun add():Int{
    var num1:Int = 11
    var num2:Int = 22
    var num3:Int = num1 + num2
    return num3
}
fun add(num1:Int):Int{
    return num1 + 10
}
fun add(num1:Int, num2:Int):Int{
    return num1 + num2
}
fun add(num1:Int, num2:Double):Double{
    var num3:Double = num1 + num2
    return num3
}
fun add(num1:Double, num2:Int):Double{
    var num3:Double = num1 + num2
    return num3
}