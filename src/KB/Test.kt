package KB

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-24
 */
const val PI = 3.14

/*
*
* 为什么编译时常量智能定义在函数之外？
* 如果在函数之内定义，就必须在运行时才能调用函数赋值，何来编译时常量一说
* 结论：编译时常量只能在函数之外定义，就可以在编译期间初始了
* */
fun main() {
    println("世界你好")
}