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
        if (n < 0) {
            println("Test $i:\nNO RESULT")
        } else {
            println("Test $i:")
            for (j in 0..n) {
                if (j % 2 == 0) {
                    print("$j ")
                }
            }
            println()
        }
    }
}