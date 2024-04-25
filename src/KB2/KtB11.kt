package KB2

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-24
 * @description lambda
 */
fun main() {
    /*
    * 自动推断
    * */
    val addResult = { num1: Int, num2: Int ->
        "两数相加结果   ：  ${num1 + num2}"
    }
    /*
    * 匿名函数就是lambda
    * */
    println(addResult(10, 10))
}