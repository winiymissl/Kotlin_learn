package KB3

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-25
 * 异常处理 与 自定义异常特点
 */
fun main() {
    try {
        var name: String? = null
        checkException(name)
    } catch (e: Exception) {
        println("$e")
    }
}

fun checkException(name :String?) {
    /**
    * 如果为null，则继续执行，也就是抛出异常
     * */
    name?:throw CustomException()
}
class  CustomException :IllegalStateException("你的代码不严谨")