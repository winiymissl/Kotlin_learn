package KB3

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-25
 * 先决条件函数
 */
fun main() {
    var value: String? = null
    var value2: Boolean = false
//    checkNotNull(value) //Exception in thread "main" java.lang.IllegalStateException: Required value was null.
//    requireNotNull(value)  //Exception in thread "main" java.lang.IllegalArgumentException: Required value was null.
    /**
    * 为true则正常
    * */
    check(value2) //Exception in thread "main" java.lang.IllegalStateException: Check failed.
}