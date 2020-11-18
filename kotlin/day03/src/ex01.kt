/*
    when - java에서 switch case 문과 비슷함
        수식이나 값의 결과에 따라서
        수행 될 부분을 결정함
        다양한 type의 값을 비교할 수 있음
        when(변수 or 수식){
            값1 -> statement....
            값2 -> statement....
            값3 -> statement....
        }
 */

fun main() {
    val n1 = 22
    when(n1){
        11 -> println("나는 11이다!!")
        22 -> println("나는 22이다!!")
        33 -> println("나는 33이다!!")
    }

    println("==============")

    val n2 = 4
    when(n2){
        1 -> println("나는 1")
        2 -> {
            println("나는 2")
            println("나는 2 입니다.")
        }
        3 -> println("나는 3")
        else -> println("n2는 1, 2, 3 이 아닙니다.")
    }

    println("==============")

    val n3 = 5
    when(n3){
        1, 2 -> println("n3은 1이거나 2입니다")
        3, 4 -> println("n3은 3이거나 4입니다")
        5, 6 -> println("n3은 5이거나 6입니다")
    }

    println("==============")

    val n4 = 3.1456789
    when(n4){
        1.1456789, 2.1456789 -> println("n4은 1.1456789이거나 2.1456789입니다")
        3.1456789, 4.1456789 -> println("n4은 3.1456789 또는 4.1456789")
        5.1456789, 6.1456789 -> println("n4은 5.1456789이거나 6.1456789입니다")
        else -> println("n4는 통과하지 못했습니다.")
    }

    println("==============")

    val n5 = "bye"
    when(n5){
        "hello" -> println(n5)
        "java" -> println(n5)
        "bye" -> println(n5)
        else -> println("n5는 통과하지 못했습니다.")
    }

    println("==============")

    val n6 = 2
    when(n6){
        in 1..3 -> println("n6는 1~3 사이의 숫자 입니다.")
        in 4..6 -> println("n6는 4~6 사이의 숫자 입니다.")
        in 7..9 -> println("n6는 7~9 사이의 숫자 입니다.")
        else -> println("n6은 1~9 사이의 숫자가 아닙니다.")
    }

    println("==============")

    var str1 = setValue(1)
    var str2 = setValue(2)
    var str3 = setValue(3)

    println(" : 1 "+str1)
    println(" : 2"+str2)
    println(" : 3 "+str3)
}

fun setValue(num:Int) = when(num){
    1 -> println("---1---")
    2 -> {
        println("---2---")
        "hello-2"
    }
    else -> "그 이외의 hello"
}