/*

    함수 : code의 재사용 - input > output

    fun 함수이름 (Parameter):return type

    parameter : 매개변수
        함수가 실행할 때 필요한 것
    argument : 인자값, 인자, 인수, 차이 수
        함수를 실행시킬 때 넣어주는 값

*/

fun main() {    // 프로그램의 시작
    test1()
    test2(11, 2.2)
}   // 프로그램의 종료

// 함수 정의부(definition)
fun test1(){    //함수 선언부(declaration)
    println("test1() 함수 호출됨")
}

fun test2(n1:Int, n2:Double){
    println("test2() 함수 호출됨")
    println("n1 : ${n1}")
    println("n2 : $n2")
}