package com.tjoeun.kotlin.enum

fun main() {
    displayDirection(Direction.WEST)
    displayDirection(Direction.EAST)

    displayNumbers(Numbers1.ONE)
    displayNumbers(Numbers1.TWO)

    displayNumbers2(Numbers2.ONE)
    displayNumbers2(Numbers2.TWO)
}

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

enum class Numbers1(val num: Int) {
    ONE(11),
    TWO(22),
    THREE(33),
    FOUR(44)
}

enum class Numbers2(val num: Int, val str: String) {
    ONE(11, "십일"),
    TWO(22, "이십이"),
    THREE(33, "삼십삼"),
    FOUR(44, "사십사")
}

fun displayDirection(d1: Direction) {
    when(d1) {
        Direction.NORTH -> println("북쪽")
        Direction.SOUTH -> println("남쪽")
        Direction.EAST -> println("동쪽")
        Direction.WEST -> println("서쪽")
    }
}

fun displayNumbers(n1: Numbers1) {
    when(n1) {
        Numbers1.ONE -> println("ONE")
        Numbers1.TWO -> println("TWO")
        Numbers1.THREE -> println("THREE")
        Numbers1.FOUR -> println("FOUR")
    }
    when(n1.num) {
        11 -> println("ONE")
        22 -> println("TWO")
        33 -> println("THREE")
        44 -> println("FOUR")
    }
}

fun displayNumbers2(n2: Numbers2) {
    when(n2.num) {
        Numbers2.ONE.num -> println("${Numbers2.ONE.str}")
        Numbers2.TWO.num -> println("${Numbers2.TWO.str}")
        Numbers2.THREE.num -> println("${Numbers2.THREE.str}")
        Numbers2.FOUR.num -> println("${Numbers2.FOUR.str}")
    }
}
