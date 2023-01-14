package exercises87

/**
 * @author Branium Academy
 * @version 2023.01
 * @see <a href="https://braniumacademy.net">Trang chủ</a>
 */

fun main() {
    println("Nhập số lượng bộ test: ")
    val t = readln().toInt()
    for (i in 1..t) {
        val n = readln().toInt()
        if (n in 1..20) {
            var sum = 0uL
            var factorial = 1uL
            for (j in 1..n) {
                factorial *= j.toULong()
                sum += factorial
            }
            println("Test $i:\n$sum")
        } else {
            println("Test $i:\nINVALID")
        }
    }
}