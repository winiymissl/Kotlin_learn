package KB4

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-26
 * set集合
 */
fun main() {
    val set = setOf("man", "what", "can", "i", "say", "man")
    /**
     * list提供了运算符重载，但是set没有提供运算符重载
     * */


    set.elementAt(0)
    set.elementAt(1)
    set.elementAt(2)
    set.elementAt(3)
    set.elementAt(4)


    println(set.elementAtOrElse(10) { "小子，你越界了了" })
    /**
     * 可变set集合
     * mutableSet
     * */
    val name = mutableSetOf("asdfasdfasdf")
    println(name)
}