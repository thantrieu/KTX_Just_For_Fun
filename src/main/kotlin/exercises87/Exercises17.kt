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
        if (n <= 0) {
            println("Test $i:\nINVALID")
        } else {
            var sum: Long = 0
            for (j in 1..n) {
                sum += j.toLong()
            }
            println("Test $i:\n$sum")
        }
    }
}