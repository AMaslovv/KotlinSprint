package lesson_3

/** by AMaslov  */

fun main() {
    //первый ход
    var startPosChess = "E2"
    var finalPosChess = "E4"
    var currentMove = 1

    var statChessSend = "$startPosChess-$finalPosChess;$currentMove"
    println(statChessSend)

    //следующий ход
    startPosChess = "D2"
    finalPosChess = "D3"
    currentMove++

    statChessSend = "$startPosChess-$finalPosChess;$currentMove"
    println(statChessSend)
}







