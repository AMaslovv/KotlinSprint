package lesson_9

/** by AMaslov  */

fun main() {
    //вывод ингредиентов в консоль из списка
    println("В рецепте есть следующие ингредиенты:\n")

    val ingredUserList = listOf("сыр", "масло", "куркума", "базилик", "мясо", "специи").forEach() { println(it) }
}