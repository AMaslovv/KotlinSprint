package lesson_8

/** by AMaslov  */

fun main() {
    //создаем массив с ингредиентами
    val ingredientsArray = arrayOf("картофель", "лук", "морковь", "горох", "майонез", "соль", "колбаса")

    print("Введите название ингредиента для поиска в рецепте: ")
    val userSearch = readln()

    //ищем введенный ингредиент в массиве
    if (ingredientsArray.contains(userSearch)) println("Ингредиент \"$userSearch\" в рецепте есть.")
    else println("Такого ингредиента в рецепте нет.")
}