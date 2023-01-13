package exercises87

/**
 * @author Branium Academy
 * @version 2023.01
 * @see <a href="https://braniumacademy.net">Trang chủ</a>
 */

fun main() {
    print("Nhập giá trị 1-7: ")
    val result = when (readln().toInt()) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "INVALID"
    }
    println(result)
}