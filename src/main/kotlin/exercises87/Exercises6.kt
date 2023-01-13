package exercises87

/**
 * @author Branium Academy
 * @version 2023.01
 * @see <a href="https://braniumacademy.net">Trang chủ</a>
 */

fun main() {
    print("Nhập vào các hệ số của phương trình bậc nhất ax + b = 0: ")
    val inputs = readln().split(' ')
    val a = inputs[0].toFloat()
    val b = inputs[1].toFloat()

    // TH1: nếu a = 0, b # 0 thì phương trình không có nghiệm
    if (a == 0.0f && b != 0.0f) {
        println("NO SOLUTION")
    } else if (a == 0.0f) {
        println("COUNTERLESS SOLUTION")
    } else {
        val x: Float = (-b / a) // nghiệm phương trình
        println(x)
    }
}