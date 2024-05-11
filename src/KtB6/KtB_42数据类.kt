package KtB6

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-29
 * 数据类加上data关键字
 * 相比于普通类多了函数
 * copy函数
 * 解构函数
 * toString
 * hashcode函数
 *
 */
//ToDo 一般用于javabean的形式下，用于数据类
data class Hang(var name: String, var age: Int) {
//    fun show() {
//        val num = 1
//        var num1 = num
//        for (i in 200 downTo 1 step 2) {
//        }
//        1 until 100
//        if ( num in 1..90) {
//
//        }
//        println(num1)
//    }
}

fun main() {
    println(Hang(age = 18, name = "王妍") === Hang(age = 18, name = "王妍"))

}