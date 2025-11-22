import kotlin.math.log
fun logarithm(result: Double, base: Double) {
    val num: Double = log(result, base)

    if ((num - num.toInt()) == 0.0)
        print("Целочисленный показатель ($base^y = $result): $num")
    else
        print("Целочисленный показатель ($base^y = $result) не существует")
}
fun main() {
    println("Программа по определению целочисленного(!) показателя степени через логарифм")

    print("Введите целое число n: ")
    val n = readln()
    print("Введите основание степени x: ")
    val x = readln()

    logarithm(n.toDouble(), x.toDouble())
}