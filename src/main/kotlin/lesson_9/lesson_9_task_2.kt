package lesson_9

/** by AMaslov  */

fun main() {
    //переменная изменяемый список
    val ingredUserList = mutableListOf("яйцо", "майонез", "курица")

    println("В рецепте есть базовые ингредиенты:\n")
    ingredUserList.forEach() { println(it) }

    print("Желаете добавить еще? (да/нет) ")
    val userAnswer = readln()
    if (userAnswer == "да") {
        print("Какой ингредиент вы хотите добавить? ")
        ingredUserList.add(readln())
        println("Теперь в рецепте есть следующие ингредиенты:\n")
        ingredUserList.forEach() { println(it) }
    }
}