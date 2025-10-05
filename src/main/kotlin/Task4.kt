fun main() {
    // Создать приложение, с помощью которого пользователь, введя два числа и символ операции, узнает результат.
    // Символами операции могут быть: / — деление, * — умножение, + — сложение, - — вычитание. Числа могут быть вещественными.
    // Числа и знак операции разделяются между собой одним пробелом. Ввод производится в формате - ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ

    println("Введите выражение в формате: ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ")
    println("Пример: 5.2 3.1 +")

    val input = readln()?.trim()

    if (input.isNullOrEmpty()) {
        println("Ввод не может быть пустым")
        return
    }

    // Разделяем строку по пробелам
    val parts = input.split(" ")

    if (parts.size != 3) {
        println("Неверный формат ввода. Используйте: ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ")
        return
    }

    val num1 = parts[0].toDoubleOrNull()
    val num2 = parts[1].toDoubleOrNull()
    val operation = parts[2]

    if (num1 == null || num2 == null) {
        println("Ошибка: введены некорректные числа")
        return
    }

    val result = when (operation) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> {
            if (num2 == 0.0) {
                println("Ошибка: деление на ноль невозможно")
                return
            } else {
                num1 / num2
            }
        }
        else -> {
            println("Ошибка: неизвестная операция '$operation'")
            return
        }
    }

    println("Результат: $result")
}