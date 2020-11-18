
class Test2
class Test3{
    //멤버변수
    var n1 = 0
    var n2 = 0

    fun method1(){
        println("== method1 ==")
    }
}

fun main(){
    val test3:Test3 = Test3()
    test3.n1 = 11
    test3.n2 = 21
    println("test3.n1 : ${test3.n1}")
    println("test3.n2 : ${test3.n2}")

    test3.method1()

}