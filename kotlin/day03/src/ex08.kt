/*
    생성자
    클래스의 정보를 바탕으로
    객체를 생성할 때 멤버변수의 값을 초기화하는
    (클래스 이름과 같은 이름의) 메소드
    모든 생성자는 return 값이 없음
     -> return type이 없음

     init code block 초기화 블럭
*/
class A1 {
    constructor() {
        println("=====A1 매개변수가 없는 생성자")
    }
    init {
        println("=====A1 객체가 생성될 때 자동으로 실행됨")
    }

}

class A2 {
    var n1: Int = 0
    var n2: Int = 0
    constructor() {
        println("매개변수가 없는 생성자")
    }
    constructor(n1:Int, n2:Int){
        this.n1 = n1
        this.n2 = n2
        println("매개변수가 두 개인 생성자")
    }
}

fun main() {
    val a1:A1 = A1()
    val a2_1:A2 = A2()

    println(a2_1.n1)
    println(a2_1.n2)

    val a2_2:A2 = A2(111, 222)
    println(a2_2.n1)
    println(a2_2.n2)

}
