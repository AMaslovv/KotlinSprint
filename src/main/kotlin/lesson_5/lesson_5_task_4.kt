package lesson_5

/** by AMaslov  */
//константы с логином и паролем
const val REGISTERED_USER_LOGIN = "Batman"
const val REGISTERED_USER_PASS = "password"

fun main() {
    //просим ввести логин и если пользователь зарегистрирован - пароль
    println("Для авторизации введите логин: ")
    val userLogin = readln()

    if (userLogin != REGISTERED_USER_LOGIN)
        println("Вы должны зарегистрироваться!")
    else {
        println("Введите пароль: ")
        val userPassword = readln()
        if (userPassword == REGISTERED_USER_PASS)
            println("Добро пожаловать!")
        else
            println("Ошибка авторизации!")
    }
}