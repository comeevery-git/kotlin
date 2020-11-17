fun main() {

    val score:Int = 88
    var grade:Char

    if(score >= 90){
        grade = 'A'
    } else if(score >= 80){
        grade = 'B'
    } else if(score >= 70){
        grade = 'C'
    } else if(score >= 60){
        grade = 'D'
    } else {
        grade = 'F'
    }

    println("당신은 $grade 학점입니다.")
}