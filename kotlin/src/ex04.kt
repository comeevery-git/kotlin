fun main() {

    val number:Int = 100
    // 변수 선언 -> memory 저장 -> coputer의 ram 주소값 -> computer는 알고있다.
    // 타입 우선 공간 확보, 변수 넣음
    println(number);
    println(number+100);
    // number = 30
    println("number : ${number}")
    println("val은 변경 될 수 없다.")

    var num:Int = 100
    println(num)
    println(num+100)
    num = 30
    println("num : $num")

    println("다양한 변수 출력 문법")

    var number2 = 2
    println("$number2")
    number2 = 3
    println("${number2}")

}