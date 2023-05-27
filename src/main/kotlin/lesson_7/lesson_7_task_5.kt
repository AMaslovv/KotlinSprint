package lesson_7

/** by AMaslov  */

fun main() {
    //инициализация переменных и создание набора символов
    val symbols = ('a'..'z') + (0..9) + ('A'..'Z')
    var userPass = ""

    println("Эта программа - генератор паролей.\nДля создания пароля введите в консоль длину пароля.\n")
    println("Длина пароля:")
    val passLength = readln().toInt()

    //генерируем пароль
    repeat(passLength) {
        userPass += symbols.random()
    }
    //Вывод в консоль
    println("Ваш пароль: $userPass")
}