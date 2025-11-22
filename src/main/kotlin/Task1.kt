import java.lang.StringBuilder
fun encodeString(input: String): String {
    if (input.isEmpty())
        return ""

    var result: String = ""
    var count = 1

    for (i in 1 until input.length) {
        if (input[i] == input[i-1]) {
            count++
        } else {
            result += input[i-1]
            if (count > 1) result += count
            count = 1
        }
    }

    result += input.last()
    if (count > 1) result += (count)

    return result
}
fun main() {
    println("Данная программа при вводе строки определяет подряд идущие одинаковые символы и записывает число такого символа.")
    print("Введите строку из символов: ")

    val input = readln()
    val output = encodeString(input)

    println("Итоговая строка: $output")
}