package lesson_7

/** by AMaslov  */

fun main() {
    //инициализация переменных и создание пароля
    val symbolOne = ('a'..'z').random()
    val symbolTwo = (0..9).random()
    val symbolTree = ('a'..'z').random()
    val symbolFour = (0..9).random()
    val symbolFive = ('a'..'z').random()
    val symbolSix = (0..9).random()
    println("Ваш пароль: $symbolOne$symbolTwo$symbolTree$symbolFour$symbolFive$symbolSix")
}