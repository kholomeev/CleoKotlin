import java.lang.StringBuilder

fun main() {
    // Создать приложение, которое подсчитывает количество подряд идущих одинаковых символов во введенной строке.
    // На вход подается, например, строка AAADSSSRRTTHAAAA. На выходе получаем A3DS3R2T2HA4.
    // То есть, если количество подряд идущих символов меньше двух, то мы не пишем единицу.
    println("Данная программа при вводе строки определяет подряд идущие одинаковые символы и записывает число такого символа")
    print("Введите строку из символов: ")
    var input = readln()

    if (input.isEmpty()) {
        input = ""
    }

    val result = StringBuilder()
    var count = 1

    for (i in 1 until input.length) {
        if (input[i] == input[i-1]) {
            count++
        } else {
            result.append(input[i-1])
            if (count > 1) result.append(count)
            count = 1
        }
    }
    // последний символ
    result.append(input.last())
    if (count > 1) result.append(count)

    println("Итоговая строка: $result")
}