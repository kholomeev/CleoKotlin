import java.lang.StringBuilder
fun encodeString(input: String): String {
    if (input.isEmpty())  // Определение строки на количество введённых символов
        return ""

    val result = StringBuilder() // результат — строка типа A3DS3R2T2HA4
    var count = 1 // счётчик одинаковых символов

    for (i in 1 until input.length) { // цикл от 1 (начальный индекс символа Kotlin) до кол-ва символов в строке
        if (input[i] == input[i-1]) { // если текущий символ равен предыдущему,
            count++ // то количество символа увеличивается на 1
        } else {
            result.append(input[i-1]) // запись символа (предыдущий по счёту)
            if (count > 1) result.append(count) // если символов несколько, то к нему добавляется число счётчика
            count = 1 // сброс счётчика
        }
    }

    result.append(input.last()) // последний символ
    if (count > 1) result.append(count) // добавление числа счётчика

    return result.toString()
}
fun main() {
    // Создать приложение, которое подсчитывает количество подряд идущих одинаковых символов во введенной строке.
    // На вход подается, например, строка AAADSSSRRTTHAAAA. На выходе получаем A3DS3R2T2HA4.
    // То есть, если количество подряд идущих символов меньше двух, то мы не пишем единицу.
    println("Данная программа при вводе строки определяет подряд идущие одинаковые символы и записывает число такого символа.")
    print("Введите строку из символов: ")

    val input = readln() // входная строка типа AAADSSSRRTTHAAAA
    val output = encodeString(input)

    println("Итоговая строка: $output") // вывод итоговой строки
}