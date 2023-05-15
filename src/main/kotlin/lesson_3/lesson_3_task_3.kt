package lesson_3

/** by AMaslov  */

fun main() {
    //переменная множитель
    val mnojitel = 7
    
    //формирование таблицы умножения с заданным множителем
    val resultMultTable = """
                |$mnojitel x 1 = ${mnojitel * 1}
                |$mnojitel x 2 = ${mnojitel * 2}
                |$mnojitel x 3 = ${mnojitel * 3}
                |$mnojitel x 4 = ${mnojitel * 4}
                |$mnojitel x 5 = ${mnojitel * 5}
                |$mnojitel x 6 = ${mnojitel * 6}
                |$mnojitel x 7 = ${mnojitel * 7}
                |$mnojitel x 8 = ${mnojitel * 8}
                |$mnojitel x 9 = ${mnojitel * 9}
    """.trimMargin()

    //вывод таблицы умножения в консоль
    println(resultMultTable)
}