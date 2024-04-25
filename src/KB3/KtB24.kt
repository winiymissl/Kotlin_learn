package KB3

import kotlin.math.roundToInt

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-25
 * kotlin语言的subString
 */
const val INFO = "hello，world"
fun main() {
    val indexOf = INFO.indexOf('w')
    /**
     * 两者是等价的
     * kt长常用第一种
     * */
    println(INFO.substring(0 until indexOf))
    println(INFO.substring(0, indexOf))

    val text = "America,China,Russain,Japan"
    val list = text.split(",")
    //C++ 结构操作，kotlin 也有
    val (v1, v2) = list
    println("v1 ,$v1, v2, $v2")

    /**
     * kotlin 中 == 和 === 的区别
     * == 是指内容，相当于equals
     * === 是引用，回忆关于字符串常量池的知识
     * */
    val name1: String = "change"
    val name2 = "change"
    println(name2 == name1)
    println(name2 === name1)
    /**
     * kotlin字符串的遍历
     * */

    val str = "jsuhkshfsjkdfhuwefhskjdfjwoefs"
    str.forEach {
        println("所有的字符$it")
    }
    /**
     * 数据之间的转化，类型之间的转化
     * 数字类型的安全转化函数
     * 如果有字符串转int ，尽量使用第二种
     * */
    val number: Int = "666".toInt()
    val number1: Int? = "666".toIntOrNull()

    /**
     * double转到int与类型格式化
     * roundToInt是四舍五入
     * */
    //66.855555  66.233333
    println(66.855555.roundToInt())  // 四舍五入
    println(66.855555.toInt())  // 非四舍五入
    //保留小数
    val r = "%.3f".format(66.855555)
    println(r)  // 四舍五入
}