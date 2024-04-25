package KB3

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-25
 * 安全调用操作符
 */
fun main() {
    var name: String? = "bc"
    var user = 100

    name = null
//name是可空类型
    /**
     * TODO
     * 如果name是可空类型，如果真的是null，？后面这一段代码不执行
     * 就不会引发空指针异常
     * */
    name?.capitalize()
}

