/*
*
* id가 555이고 password가 333인 경우 "로그인 성공" 출력
* 틀린 경우에는 "로그인 실패" 출력
*
*/

fun main() {
    var id:Int = 555
    var pwd:Int = 333
    login(id, pwd)
}

fun login(id:Int, pw:Int) {
    //var flag:Boolean = id == 555 && pw == 333
    var flag:Boolean = id == 555
    flag = flag && pw == 333
    if(flag){
        println("로그인 성공")
    } else {
        println("로그인 실패")
    }

    var flag1:Boolean = id == 555
    var flag2:Boolean = pw == 333
    if(flag1 && flag2){
        println("로그인 성공")
    } else if(!flag1) {
        println("아이디를 확인해주세요.")
    } else if(!flag2) {
        println("비밀번호를 확인해주세요.")
    }


}
