package exercises87

/**
 * @author Branium Academy
 * @version 2023.01
 * @see <a href="https://braniumacademy.net">Trang chủ</a>
 */

fun main() {
    print("Nhập vào 3 số thực: ")
    val inputs = readln().split(' ')
    val a = inputs[0].toDouble()
    val b = inputs[1].toDouble()
    val c = inputs[2].toDouble()

    // điều kiện tạo thành tam giác là tổng hai cạnh bất kì
    // luôn lớn hơn cạnh còn lại
    if ((a + b > c) && (b + c > a) && (a + c > b)) {
        println("YES")
    } else {
        println("NO")
    }
}