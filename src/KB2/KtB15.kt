package KB2

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-24
 * @Description 函数类型作为返回类型
 */
fun main() {
    val niming = showMethod("我是showMethod")
    /**
     * 只不过这个函数的返回值是一个函数
     * 就像是可以是 类的对象 和 其他引用类型一样。md这就是个引用类型呀，哈哈
     * 下面是当作变量直接就调用了
     * */
    show(niming)
}

fun show(result: (String) -> String): Boolean {
    return false
}

//showMethod函数，再返回一个匿名函数
fun showMethod(name: String): (String) -> String {
    /**
     * 返回一个匿名函数
     * */
    println("我是show函数")
    return { s: String ->
        "我是匿名函数 $name"
    }
}