package exercises87

/**
 * @author Branium Academy
 * @version 2023.01
 * @see <a href="https://braniumacademy.net">Trang chủ</a>
 */

fun main() {
    print("Nhập điểm hệ 10: ")
    val score = readln().toDouble()
    if (score > 10.0 || score < 0.0) {
        println("INVALID")
    } else {
        val rank: Char = if (score >= 9.0) { // >= 9.0
            'A'
        } else if (score >= 7.0) { // 7.0 <= score < 9.0
            'B'
        } else if (score >= 5.0) { // 5.0 <= score < 7.0
            'C'
        } else if (score >= 4.0) { // 4.0 <= score < 5.0
            'D'
        } else { // còn lại là dưới 4.0
            'F'
        }
        println(rank)
    }
}