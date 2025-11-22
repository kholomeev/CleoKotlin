fun canFormOdd(a: Int, b: Int): Int? {
    return when {
        a % 2 == 1 -> a * 10 + b
        b % 2 == 1 -> b * 10 + a
        else -> null
    }
}

fun main() {
    print("Введите первую цифру: ")
    val first = readln().toIntOrNull()

    print("Введите вторую цифру: ")
    val second = readln().toIntOrNull()

    if (first == null || second == null) {
        println("Введено некорректное число")
        return
    }

    if (first == second) {
        println("Цифры должны быть различными")
        return
    }

    val result = canFormOdd(first, second)
    if (result != null) {
        println("Составленное нечетное число: $result")
    } else {
        println("Создать нечетное число невозможно")
    }
}
