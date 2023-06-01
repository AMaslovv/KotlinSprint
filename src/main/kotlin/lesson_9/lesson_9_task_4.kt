package lesson_9

/** by AMaslov  */

fun main() {
    println("Введите пять ингридиентов через запятую: ")
    val usrAnswer: String = readln()
    val ingredList = usrAnswer.split(",").toMutableList()
    ingredList.sort()

    ingredList.forEach{
        println(it)
    }
}