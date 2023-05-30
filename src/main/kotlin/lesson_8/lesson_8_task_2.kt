package lesson_8

/** by AMaslov  */

fun main() {
    //создаем массив с ингредиентами
    val ingredientsArray = arrayOf("картофель", "лук", "морковь", "горох", "майонез", "соль", "колбаса")

    print("Введите название ингредиента для поиска в рецепте: ")
    val userSearch = readln()

    //ищем введенный ингредиент в массиве
    for (ingredient in ingredientsArray) {
        if (ingredient == userSearch) {
            println("Ингредиент \"$ingredient\" в рецепте есть.")
            break
        } else if (ingredientsArray.indexOf(ingredient) == ingredientsArray.size - 1) println("Такого ингредиента в рецепте нет.")
    }
}