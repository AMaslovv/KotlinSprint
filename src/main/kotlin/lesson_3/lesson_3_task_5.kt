package lesson_3

/** by AMaslov  */

fun main() {
    //переменая с данными с сервера
    val statChessSend = "D2-D4;0".split("-",";")

    //парсинг и вывод в консоль
    val startChessPos = statChessSend[0]
    val finalChessPos = statChessSend[1]
    val currentMove = statChessSend[2]
    print("$startChessPos\n$finalChessPos\n$currentMove")
}