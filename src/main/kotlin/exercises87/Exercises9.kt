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

    // điều kiện tạo thành tam giác vuông: tạo thành tam giác và
    // tổng bình phương hai cạnh kề bằng bình phương cạnh huyền
    if ((a + b > c) && (b + c > a) && (a + c > b)) {
        // điều kiện tạo tam giác vuông
        if (a * a + b * b == c * c
            || a * a + c * c == b * b
            || b * b + c * c == a * a
        ) {
            println("YES")
        } else { // không thỏa mãn
            println("NO")
        }
    } else {
        println("NO")
    }
}