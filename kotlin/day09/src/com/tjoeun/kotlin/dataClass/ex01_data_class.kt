fun main() {
    var test1 = Test1(111, 222)
    var test2 = Test2(111, 222)

    println("test1.n1: ${test1.n1}")
    println("test2.n1: ${test2.n1}")

    println("test1.n2: ${test1.n2}")
    println("test2.n2: ${test2.n2}")

    var test3 = Test1(111,222,333)
    var test4 = Test2(111,222,333)

    println("test3.n1: ${test3.n1}")
    println("test4.n1: ${test4.n1}")

    println("test3.n2: ${test3.n2}")
    println("test4.n2: ${test4.n2}")

    println("test3.n3: ${test3.n3}")
    println("test4.n3: ${test4.n3}")

    test3.test1Method()
    test4.test2Method()

    println("=========================")

    var test1_3 = Test1(111, 222)
    var test1_4 = Test1(111, 222)
    //Operator '===' cannot be applied to 'Test1' and 'Test2'
    // test2_3객체는 data class의 객체이므로(서로 다른 클래스라서 비교가 안된다는 뜻)
    //    if (test1_3 === test2_3) {
    if (test1_3 == test1_4) {
        //this will be called
        println("test1_3 == test1_4는 동일한 객체입니다.")
    }
    else {
        println("test1_3 == test1_4는 동일한 객체가 아닙니다.")
    }

    var test2_3 = Test2(111, 222, 333)
    var test2_4 = Test2(111, 222, 333)

    if (test2_3 == test2_4) {
        println("test2_3 == test2_4는 동일한 객체입니다.")
    }
    else {
        //this will be called
        println("test2_3 == test2_4는 동일한 객체가 아닙니다.")
    }

    // 일반클래스에서는 오류 발생
    // val test1_5 = test1_3.copy()
    val test2_5 = test2_3.copy()
    // 주생성자의 값만 카피함
    println("test2_5.n1: ${test2_5.n1}")
    println("test2_5.n2: ${test2_5.n2}")
    println("test2_5.n3: ${test2_5.n3}")

    // 카피된 객체의 값을 바꿔도 원본에 영향미치지않음, 이로써 새로운 객체라고 볼수있음
    test2_5.n1 = 999
    println("test2_3.n1: ${test2_3.n1}")
    println("test2_5.n1: ${test2_5.n1}")

    println("=========================")

    // component1 = 주생성자로 인해서 할당된값 변수1, 2는 변수2
    var cpn1 = test2_3.component1()
    var cpn2 = test2_3.component2()
    // n1
    println("cpn1: $cpn1")
    // n2
    println("cpn2: $cpn2")

    var test3_1 = Test3(111,222,333)
    println("test3_1.component1(): ${test3_1.component1()}")
    println("test3_1.component1(): ${test3_1.component2()}")
    println("test3_1.component1(): ${test3_1.component3()}")

    println("=========================")

    // 주생성자로 할당된(component3 함수가 있는) 변수만 가능
    // var (num1, num2, num3) = test2_3
    var (num1, num2) = test2_3
    println("num1: $num1")
    println("num2: $num2")
}

open class Test1(var n1: Int, var n2: Int) {
    var n3 = 0
    init {
        println("Test1의 init")
    }
    constructor(n1: Int, n2: Int, n3: Int): this(n1, n2) {
        this.n3 = n3
    }
    fun test1Method() {
        println("test1의 test1Method")
    }
}
// data class는 다른 class의 부모가 될 수 없음
data class Test2(var n1: Int, var n2: Int) {
    var n3 = 0
    init {
        println("Test2의 init")
    }
    constructor(n1: Int, n2: Int, n3: Int): this(n1, n2) {
        this.n3 = n3
    }
    fun test2Method() {
        println("test2의 test2Method")
    }
}

data class Test3(var n1: Int, var n2: Int, var n3: Int) {

}