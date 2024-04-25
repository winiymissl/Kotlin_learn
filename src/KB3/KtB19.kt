package KB3

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-25
 */
/**
 *TODO
 * 在kotlin中使用带let的安全调用
 */
fun main() {
    var name: String? = null
    println(name)
    /**
     * TODO
     * name是可空类型，如果真的是null，？后面这一段代码不执行，就不会引发空指针异常
     * 如果能够执行到let函数里面，那么说明it一定不为null
     *
     * 主要知识点：
     * 1. 可控类型使用时，在变量后面加一个？，会判断是否为空，如果为空的话，就不需要执行后面的代码了
     * 2. let函数
     * */
    name.let {
        it?.length
    }
    println(name?.length)
    name?.let {
        println("是否执行呢")
    }
}
/**
 *
 * Kotlin 的 let 函数主要有以下几个常见的应用场景:
 *
 * Null 安全处理:
 *
 * 在处理可能为 null 的对象时,使用 let 函数可以安全地执行后续操作,避免 NullPointerException。
 * 链式调用:
 *
 * 将多个操作通过 let 函数串联起来,可以写出更加简洁和可读性强的代码。
 * 局部变量作用域:
 *
 * 使用 let 函数可以在一个局部作用域内操作对象,避免污染外部作用域。
 * 结果转换:
 *
 * let 函数会返回 let 函数体内最后一个表达式的结果,可以方便地将结果传递给其他函数使用。
 * 配合其他高阶函数使用:
 *
 * let 函数可以和其他 Kotlin 高阶函数如 map、filter 等配合使用,进行更复杂的数据转换和处理。
 *
 * */