fun countChars(input: String): String {
    val freq = mutableMapOf<Char, Int>() // карта "символ — количество"
    for (ch in input) {
        freq[ch] = freq.getOrDefault(ch, 0) + 1
    }
    val sorted = freq.toSortedMap() // сортировка ключей по алфавиту

    val result = StringBuilder()
    for ((char, count) in sorted) {
        result.append("$char — $count\n")
    }

    return result.toString()
}

fun main() {
    // Создать приложение, которое подсчитывает количество различных символов во введенной строке.
    // Символы в ответе расположить в алфавитном порядке. Например, дана строка AASADDSS. На выходе получаем:
    // A - 3
    // D - 2
    // S - 3
    println("Данная программа при вводе строки подсчитывает количество различных символов во введенной строке и записывает результат в столбик.")
    print("Введите строку из символов: ")
    val input = readln()
    val output = countChars(input)

    print(output)

}