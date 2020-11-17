/*
    전역변수
*/

fun main() {
    outer()
}

fun outer(){
    println("outer() 함수 호출")
        fun inner(){
            println("inner() 함수 호출")
        }
    inner()

}