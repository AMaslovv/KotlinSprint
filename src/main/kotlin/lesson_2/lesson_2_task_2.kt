package lesson_2

/** by AMaslov  */

fun main() {
    //объявление переменых и присваивание значений
    val workersCount = 50
    val workersInternCount = 30
    val workersSalary = 30000
    val workersInternSalary = 20000

    //вычисление зп без стажеров,общих расходов и средней на всех
    val workersSalarySum = workersCount * workersSalary
    val allWorkersSum = (workersInternCount * workersInternSalary) + workersSalarySum
    val averageWithInternal = allWorkersSum / (workersCount + workersInternCount)

    //вывод полученных результатов в консоль
    println("Расходы на постоянных сотрудников: $workersSalarySum")
    println("Общие расходы со стажерами: $allWorkersSum")
    println("Средняя зарплата: $averageWithInternal")
}