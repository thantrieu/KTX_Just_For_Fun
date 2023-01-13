package exercises87

/**
 * @author Branium Academy
 * @version 2023.01
 * @see <a href="https://braniumacademy.net">Trang chủ</a>
 */

fun main() {
    print("Nhập điểm chữ: ")
    val inputs = readln().split(' ')
    val day = inputs[0].toInt()
    val result = when (inputs[1].toInt()) {
        1 -> when (day) {
            in 1..19 -> "Ma Kết"
            in 20..31 -> "Bảo Bình"
            else -> "INVALID DAY"
        }

        2 -> when (day) {
            in 1..18 -> "Bảo Bình"
            in 19..29 -> "Song Ngư"
            else -> "INVALID DAY"
        }

        3 -> when (day) {
            in 1..20 -> "Song Ngư"
            in 21..31 -> "Bạch Dương"
            else -> "INVALID DAY"
        }

        4 -> when (day) {
            in 1..20 -> "Bạch Dương"
            in 21..30 -> "Kim Ngưu"
            else -> "INVALID DAY"
        }

        5 -> when (day) {
            in 1..20 -> "Kim Ngưu"
            in 21..31 -> "Song Tử"
            else -> "INVALID DAY"
        }

        6 -> when (day) {
            in 1..21 -> "Song Tử"
            in 22..30 -> "Cự Giải"
            else -> "INVALID DAY"
        }

        7 -> when (day) {
            in 1..22 -> "Cự Giải"
            in 23..31 -> "Sư Tử"
            else -> "INVALID DAY"
        }

        8 -> when (day) {
            in 1..22 -> "Sư Tử"
            in 23..31 -> "Xử Nữ"
            else -> "INVALID DAY"
        }

        9 -> when (day) {
            in 1..22 -> "Xử Nữ"
            in 23..30 -> "Thiên Bình"
            else -> "INVALID DAY"
        }

        10 -> when (day) {
            in 1..23 -> "Thiên Bình"
            in 24..31 -> "Bọ Cạp"
            else -> "INVALID DAY"
        }

        11 -> when (day) {
            in 1..22 -> "Bọ Cạp"
            in 23..30 -> "Nhân Mã"
            else -> "INVALID DAY"
        }

        12 -> when (day) {
            in 1..21 -> "Nhân Mã"
            in 22..31 -> "Ma Kết"
            else -> "INVALID DAY"
        }

        else -> "INVALID MONTH"
    }
    println(result)
}