import java.lang.StringBuilder

fun binaryInt(number: Int): String {
    val stack = ArrayDeque(listOf(0))
    stack.removeLast()

    var num = number
    var i = 0

    while (num != 0) {
        val rem = num % 2
        stack.addLast(rem)
        num /= 2
        i++
    }

    val result = StringBuilder()
    while (!stack.isEmpty()) {
        val value = stack.removeLast()
        result.append(value)
    }

    return result.toString()
}
fun main() {
    println("Программа преобразования чисел из десятичной в двоичную")
    print("Введите число: ")
    val tenth = readln()
    val binary = binaryInt(tenth.toInt())

    print("Число $tenth в двоичной системе: $binary")
}