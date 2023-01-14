package exercises87

import java.text.DecimalFormat

/**
 * @author Branium Academy
 * @version 2023.01
 * @see <a href="https://braniumacademy.net">Trang chủ</a>
 */

fun main() {
    val decimalFormat = DecimalFormat("#,###.00000")
    println("Nhập số lượng bộ test: ")
    val t = readln().toInt()
    for (i in 1..t) {
        val n = readln().toInt()
        if (n <= 0) {
            println("Test $i:\nINVALID")
        } else {
            var sum = 0.0
            for (j in 1..n) {
                sum += 1.0 / (j * j)
            }
            println("Test $i:\n${decimalFormat.format(sum)}")
        }
    }
}