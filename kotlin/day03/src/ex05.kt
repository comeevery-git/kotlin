/*
    return : 함수의 수행을 중단 + 호출한 곳으로 돌아감
    break : 반복 횟수가 남아있어도 반복을 중단함
    continue : 반복 횟수가 남아있으면 다음 반복으로 넘어감
*/

fun main() {

    for (i in 1..10){
        if(i > 6){
            break
        }
        println("$i 입니다")
    }
    println("=============")

    for (i in 1..10){
        println("$i 입니다")
        if(i > 6){
            break
        }
    }
    println("=============")

    for (i in 1..10){
        if(i % 2 == 0){
            continue
        }
        println("$i 입니다")
    }
    println("======continue=======")

    for (i in 1..10){
        println("$i 입니다")
        if(i % 2 == 0){
            continue
        }
    }
    println("======continue=======")

    println(testFunc1(10000))

}