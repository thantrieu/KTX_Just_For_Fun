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
    // giả sử a là max
    var max = a
    // kiểm tra các giá trị còn lại
    if (b > max) { // nếu b lớn hơn max
        max = b   // gán max là b
    }
    if (c > max) { // nếu c lớn hơn max
        max = c   // gán max là c
    }
    // kết luận
    // nếu ba số bằng nhau, không có giá trị max
    if (a == b && b == c) {
        println("NO RESULT")
    } else {
        println(max)
    }
}