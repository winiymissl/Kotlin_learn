package KB4

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-26
 * kotlin语言的集合转换和快捷函数学习
 * 快捷函数去重distinct
 *
 */

fun main() {
    val list = listOf("世界你好", "世界你好", "里氏上")

    println(list.toSet())

    println(list.distinct())

}