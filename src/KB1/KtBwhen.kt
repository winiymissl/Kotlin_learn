package KB1

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-24
 * @Description when 表达式
 * 语句和表达式
 */
fun main() {/*
    * java 的 if 语句
    * jt的if表达式 是有返回值的
    * */
    val PI = 10/*
    * Any == Object
    * */
    var a = when (PI) {
        1 -> "你就是一个傻逼"
        2 -> 100
        else -> println("你不是傻逼")
    }
    /*
    * Unit代替void关键字，表示没有返回值
    * */
    println(a)
}