package exercises87

/**
 * @author Branium Academy
 * @version 2023.01
 * @see <a href="https://braniumacademy.net">Trang chủ</a>
 */

fun main() {
    print("Nhập vào 3 số nguyên a, b, c: ")
    val inputs = readln().split(' ')
    val a = inputs[0].toInt()
    val b = inputs[1].toInt()
    val c = inputs[2].toInt()
    // giả sử a là min
    var min = a
    // kiểm tra các giá trị còn lại
    if (b < min) { // nếu b nhỏ hơn min
        min = b   // gán min là b
    }
    if (c < min) { // nếu c nhỏ hơn min
        min = c   // gán min là c
    }
    // kết luận
    // nếu ba số bằng nhau, không có giá trị min
    if (a == b && b == c) {
        println("NO RESULT")
    } else {
        println(min)
    }
}