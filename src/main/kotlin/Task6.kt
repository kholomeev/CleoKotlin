fun oddNumber(digit1: Char, digit2: Char) {
    val result = StringBuilder()

    result.append(digit1)
    result.append(digit2)

    if (result.toString().toInt() % 2 == 1)
        print(result)
    else {
        result.append(digit2)
        result.append(digit1)

        if (result.toString().toInt() % 2 == 1)
            print(result)
        else
            print("Создать нечётное число невозможно")
    }

}
fun main() {
    // Создать приложение, в котором пользователь вводит две различных цифры.
    // На выходе приложение выдает, если это возможно, из введенных цифр, нечетное число. Результат выводится в консоль.
    // При невозможности создать нечетное число выводится сообщение – «Создать нечетное число невозможно».
    // Каждое число вводится на отдельной строке
    println("Программа по составлению нечётных чисел из двух цифр(!)")
    print("Введите первую цифру(!): ")
    //val A = readln().toCharArray()
    print("Введите вторую цифру(!): ")
    //val B = readln()

    //oddNumber(A, B)
}