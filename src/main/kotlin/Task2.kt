fun countChars(input: String): String {
    val freq = mutableMapOf<Char, Int>()
    for (ch in input) {
        freq[ch] = freq.getOrDefault(ch, 0) + 1
    }
    val sorted = freq.toSortedMap()

    val result = StringBuilder()
    for ((char, count) in sorted) {
        result.append("$char — $count\n")
    }

    return result.toString()
}

fun main() {
    println("Данная программа при вводе строки подсчитывает количество различных символов во введенной строке и записывает результат в столбик.")
    print("Введите строку из символов: ")
    val input = readln()
    val output = countChars(input)

    print(output)

}