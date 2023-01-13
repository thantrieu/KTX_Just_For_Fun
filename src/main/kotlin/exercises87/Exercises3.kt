package exercises87

/**
 * @author Branium Academy
 * @version 2023.01
 * @see <a href="https://braniumacademy.net">Trang chủ</a>
 */

fun main() {
    print("Nhập vào hai số nguyên a, b: ")
    val inputs = readln().split(' ')
    val a = inputs[0].toInt()
    val b = inputs[1].toInt()
    // kiểm tra
    if (a == b) {           // hai số bằng nhau
        println("EQUAL\n")
    } else {                // hai số khác nhau
        var dif: Int = a - b // lấy độ chênh lệch
        if (dif < 0) {      // nếu là số âm
            dif = -dif      // đổi dấu
        }
        println("DIFFERENT $dif")
    }
}