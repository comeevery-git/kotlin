/*
    while 문
    주어진 조건이 true인 경우에만 반복함
    while(조건식){
        statement...
        statement...
    }

    do while 문
    무조건 1번 실행 후 조건에 따라 반복
    do{
        statement...
        statement...
    }while(조건식)

 */

fun main() {
    var num1 = 0
    while(num1 < 10){
        println("num1 : ${num1}")
        ++num1
    }

    println("==============")

    var num2 = 0
    do {
        println("num2 : ${num2}")
        // ++num2

        num2 += 2
        if(num2 == 10){
            break;
        }

    } while(num2 < 10)


}