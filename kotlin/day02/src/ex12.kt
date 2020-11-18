fun main() {
    var s1:String = "0"
    var n2:Int = 10

    if(n2 == 10) {
        s1 = "n2는 10입니다"
    } else {
        s1 = "n2는 10이 아닙니다"
    }
    println("s1 : $s1")

    val s2:String = if(n2==10) "n2는 10입니다" else "n2는 10이 아닙니다"
    println("s2 : $s2")

    val s3:String = if(n2 == 10){
        "n2는 10입니다"
    } else {
        "n2는 10이 아닙니다"
    }
    println("s3 : $s3")

    var s4:Int = if(n2 ==10){
        3
    } else {
        0
    }
    println(s4)



}