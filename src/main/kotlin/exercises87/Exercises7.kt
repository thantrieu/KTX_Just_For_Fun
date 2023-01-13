package exercises87

import kotlin.math.sqrt

/**
 * @author Branium Academy
 * @version 2023.01
 * @see <a href="https://braniumacademy.net">Trang chủ</a>
 */

fun main() {
    print("Nhập vào các hệ số của phương trình bậc nhất ax + b = 0: ")
    val inputs = readln().split(' ')
    val a = inputs[0].toDouble()
    val b = inputs[1].toDouble()
    val c = inputs[2].toDouble()

    // nếu a = 0, giải phương trình bậc 1
    if (a == 0.0) {
        // TH1: nếu b = 0, c # 0 thì phương trình không có nghiệm
        if (b == 0.0 && c != 0.0) {
            println("NO SOLUTION")
        } else if (b == 0.0) { // TH2: nếu b = 0, c = 0 thì phương trình vô số nghiệm
            println("COUNTERLESS SOLUTION")
        } else { // TH3: phương trình có 1 nghiệm x = -b / a
            val x: Double = -c / b // nghiệm phương trình
            println(x)
        }
    } else { // ngược lại, giải phương trình bậc 2
        val delta: Double = b * b - 4 * a * c // tính delta
        // TH1: delta < 0
        if (delta < 0) { // phương trình vô nghiệm
            println("NO SOLUTION")
        } else if (delta == 0.0) { // TH2: delta = 0, phương trình có nghiệm kép
            val x = (-b / (2 * a))
            println(x)
        } else { // TH3: delta > 0
            val x1: Double = (-b - sqrt(delta)) / (2 * a)
            val x2: Double = (-b + sqrt(delta)) / (2 * a) // nghiệm phương trình
            // kết luận
            println("$x1, $x2")
        }
    }
}