/*
    반복문
    for, while, do~while
    배열의 요소들을 이용해서 code를 반복함
        for(변수 in 배열){
            statement...
            statement...
            statement...
        }
 */


fun main() {
    val numbers = 1..10
    for(number in numbers){
        print("$number")
    }

    println("\n===========2 시작============")

    val numbers2 = 1..10 step 2
    for(number in numbers2){
        print("$number")
    }

    println("\n==========3 시작=============")

    //val numbers3 = 10..1 //10에서 1로 증가할 수 없음
    val numbers3 = 10 downTo 1
    for(number in numbers3){
        print("$number")
    }

    println("\n=========4 시작==============")

    val numbers4 = 10 downTo 1 step 2
    for(number in numbers4){
        print("$number")
    }

    println("\n=============")
}