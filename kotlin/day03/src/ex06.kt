/*

    객체지향 프로그래밍
    Object Oriented Programing

    프로그램에서 사용되는 여러 data나 기능을
    클래스(객체)로 묶어서 관리하는
    프로그래밍 기법

    클래스 - 설계도
    객체(Object) - 설계도대로 만들어진 실체, 실제 메모리에 올려서 사용할 수 있게됨

    data : property (속성 - status, 변수)
    기능 : method (함수 - function)

*/

fun main() {
    val test1:TestClass1 = TestClass1() //실제 메모리에 로딩
    println(test1)  //해당 주소지에 올라가 있다
    val test2:TestClass1 = TestClass1() //실제 메모리에 로딩
    println(test2)  //해당 주소지에 올라가 있다
    var test3:TestClass1 = TestClass1() //실제 메모리에 로딩
    println(test3)  //해당 주소지에 올라가 있다

    test3 = test1
    println("test1 : $test1")
    println("test3 : $test3")
}

class TestClass1{

}