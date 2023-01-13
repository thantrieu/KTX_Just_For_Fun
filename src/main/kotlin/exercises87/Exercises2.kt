package exercises87

/**
 * @author Branium Academy
 * @version 2023.01
 * @see <a href="https://braniumacademy.net">Trang chủ</a>
 */

fun main() {
    print("Nhập vào số nguyên n: ")
    val n = readln().toInt()
    // kiểm tra và in kết quả:
    if (n < 0) {
        println("NEGATIVE")
    } else if (n == 0) {
        println("UNSIGNED")
    } else {
        println("POSITIVE")
    }
}