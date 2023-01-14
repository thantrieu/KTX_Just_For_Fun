package exercises87

import kotlin.math.sqrt

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
        if (n < 2) {
            println("Test $i: NO")
        } else {
            var isPrime = true
            for (j in 2..sqrt(n.toDouble()).toInt()) {
                if (n % j == 0) {
                    isPrime = false
                    break
                }
            }
            if (isPrime) {
                println("Test $i: YES")
            } else {
                println("Test $i: NO")
            }
        }
    }
}