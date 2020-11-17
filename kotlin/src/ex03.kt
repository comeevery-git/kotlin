/*

    자료형 : data type (type)
        data를 보관하는 공간의 크기와 모양(내부구조)

    논리형 : Boolean type (1byte)
    문자형 : Char (2)
    정수형 : Byte (1), Short(2), Int(4), Long(8)
    정수형(부호가 없는 : Unsigned)
        UByte (1), UShort(2), UInt(4), ULong(8)
        -> 음수쪽까지 표현 하느냐, 마느냐..
        -> Unsigned나 Signed나 1byte 공간 사용하는 건 똑같으나
            음수쪽 공간까지 양수가 가져와서 사용하는 것
        -> 1byte : 8bit, 데이터를 표현하려면 사용해야 하는 최소한의 단위
    실수형 : Float (4), Double (8)
        -> 정밀도의 차이. Double이 더 정확하게 표현가능
    문자열 : String (Char + Char + Char + ...)

 */

/*

    변수 선언
    val, var 키워드를 사용
    var : 선언 이후 값을 다시 저장할 수 있음, literal data, final
    val : 선언 이후 값을 다시 저장할 수 없음, Constant

    var(val) 변수이름:타입 = 값
        int a = 0;  ==>  a:int = 0

    type을 생략하는 경우
    저장하는 값에 따라서
    자료형이 자동으로 결정됨

 */