package exercises87

/**
 * @author Branium Academy
 * @version 2023.01
 * @see <a href="https://braniumacademy.net">Trang chủ</a>
 */

fun main() {
    print("Nhập điểm chữ: ")
    val result = when (readln().toCharArray()[0]) {
        'a', 'A' -> "Giỏi"
        'b', 'B' -> "Khá"
        'c', 'C' -> "Trung bình"
        'd', 'D' -> "Yếu"
        'f', 'F' -> "Liệt"
        else -> "INVALID"
    }
    println(result)
}