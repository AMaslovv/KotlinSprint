package lesson_8

/** by AMaslov  */

fun main() {
    //создаем массив с ингредиентами
    val ingredientsArray = arrayOf("картофель", "лук", "морковь", "горох", "майонез", "соль", "колбаса")

    println("Текущий список ингредиентов: ${ingredientsArray.contentToString()}\n")

    print("Введите название ингредиента, который хотите заменить: ")
    val ingredientWichReplace = readln()

    //ищем ингредиент и если он есть заменяем на введеный пользователем
    if (ingredientsArray.contains(ingredientWichReplace)) {
        print("Введите название ингредиента, который хотите добавить: ")
        val ingredientUserAdd = readln()
        val indexIngredient = ingredientsArray.indexOf(ingredientWichReplace)
        ingredientsArray[indexIngredient] = ingredientUserAdd

        // выводим в консоль обновленный список
        println("Готово! Вы сохранили следующий список: ${ingredientsArray.contentToString()}")
    } else println("Такого ингредиента в рецепте нет.")
}