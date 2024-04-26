package KB4

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-26
 * 数组的创建
 */
fun main() {
    val int = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(int[0])
    println(int[1])
    println(int[3])
    println(int[4])
    println(int.elementAtOrElse(1234) { -1 })


    val double = doubleArrayOf(1.2, 1.3)
    val long = longArrayOf(312341234123412, 412341234123412, 34124123412341234)
    val short = shortArrayOf(1, 3, 4, 45, 5, 6, 6, 77)
    //对象数组
    val array = arrayOf("asdfas", Change())
    //集合转数组
}

class Change {
    var name = null
}