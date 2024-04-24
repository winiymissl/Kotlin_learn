package KB2

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-24
 * @Description it关键字
 */
fun main() {
    val methodAction: (String) -> String = {
        /**
         * 自动有一个it
         * */
        val number = 1232345

        /**
         * 隐式返回
         * */
        "我是世界之王$number,还有$it"
    }
    println(methodAction.invoke("世界你好"))
    println(methodAction("世界你好"))
    /**
     * 匿名函数的类型推断
     * 这里指的是返回类型可以自动推断
     * 使用了冒号，就必须指定返回和输入参数的类型
     * */
    val methodAction2 = { v1: Int, v2: Int, v3: Int ->
        "$v1,$v2,$v3"
    }
    println(methodAction2(4, 5, 6))
    val method1 = {
        "世界是一个bug"
    }
    println("method1  :  " + method1())
    val method2 = { num: Int, num1: Int ->
        "$num,$num1"
    }
    println("method2 : " + method2(2, 3))
}
