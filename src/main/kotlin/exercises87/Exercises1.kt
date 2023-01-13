package exercises87

/**
 * @author Branium Academy
 * @version 2023.01
 * @see <a href="https://braniumacademy.net">Trang chủ</a>
 */

fun main() {
    print("Nhập vào số nguyên n: ")
    val n = readln().toInt()
    // kiểm tra
    if (n % 2 == 0) { // n chia hết cho 2 thì n là số chẵn
        println("EVEN")
    } else { // ngược lại n là số lẻ
        println("ODD")
    }
}