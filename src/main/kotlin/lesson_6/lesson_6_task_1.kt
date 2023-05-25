package lesson_6


/** by AMaslov  */

fun main() {
    //создание переменных для логина и пароля
    val registrUserLogin: String
    val registrUserPass: String

    println("Для авторизации необходимо создать учетную запись.\n")

    //записываем в переменные логин и пароль
    println("Введите логин для регистрации: ")
    registrUserLogin = readln()
    println("Придумайте пароль: ")
    registrUserPass = readln()
    println("Учетная запись создана.")

    //в цикле проверяем данные для авторизации
    while (true){
        println("Введите логин: ")
        val authorizUserLogin = readln()
        println("Введите пароль: ")
        val authorizUserPass = readln()

        if (authorizUserLogin == registrUserLogin && authorizUserPass == registrUserPass){
            println("Авторизация прошла успешно.")
            break
        }
        else println("Неверные логин или пароль.")
    }
}