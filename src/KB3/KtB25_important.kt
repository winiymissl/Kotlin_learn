package KB3

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-25
 * 内置函数
 * 总结：
 * 返回是调用者的内置函数，多用于链式调用，给对象赋值，android ：使用recyclerview
 * 返回是执行结果的多用于进行一些判断之类的东西
 *
 * let 更适合用于在对象不为 null 时执行操作，而 run 则更适合用于在对象上执行操作，并返回结果、
 *
 * 返回值为本身的：
 * apply（this），also（it），takeIf(根据情况)，takeUnless(根据情况)
 * 返回最后一行结果的
 * let，with，run
 */
fun main() {
    /**
     * apply内置函数
     * apply特点：
     *@kotlin.internal.InlineOnly
     * public inline fun <T> T.apply(block: T.() -> Unit): T {
     *     contract {
     *         callsInPlace(block, InvocationKind.EXACTLY_ONCE)
     *     }
     *     block()
     *     return this
     * }
     * TODo
     * 1.返回值永远是调用者
     * 2.假设是一个其他的类，就可以直接调用类的方法和属性
     *
     * 一般用于：
     * apply匿名函数里面持有的this == 对象本身
     * 相当于持有了整个类
     * 实质上可以理解为扩展函数
     *
     * 理解：
     * 它用于在对象上执行一系列操作，并返回该对象本身
     * */
    val info = "I Am Ironman"
    info.apply {
        println(toLowerCase())
    }.apply {
        println(toUpperCase())
    }.apply {
        println(length)
    }
    /**
     * let 函数
     *@kotlin.internal.InlineOnly
     * public inline fun <T, R> T.let(block: (T) -> R): R {
     *     contract {
     *         callsInPlace(block, InvocationKind.EXACTLY_ONCE)
     *     }
     *     return block(this)
     * }
     *
     * 特点
     * 1. let函数将最后一行的表达式作为结果返回也就是R，
     * 2. 后面lambda的参数是调用者本身，作为默认参数it，可以使用it调用、
     *
     * 理解：
     * 它允许你在对象上执行指定的操作，并在操作完成后返回结果。
     * */
    val list = listOf(6, 3, 5, 6, 7, 8, 8, 85, 5, 434, 33, 3)
    list.let {
        println(it.toString())
    }
    /**
     * run函数
     * @kotlin.internal.InlineOnly
     * public inline fun <T, R> T.run(block: T.() -> R): R {
     *     contract {
     *         callsInPlace(block, InvocationKind.EXACTLY_ONCE)
     *     }
     *     return block()
     * }
     * 特点：
     * 1. 返回最后一行表达式，可看作调用者的扩展函数，因此可以使用this，调用所有在调用者里面的函数，属性等
     * 2. this一般可以省略
     *
     * 理解：
     * 它用于在指定的上下文（对象）中执行一系列操作，并返回操作的结果
     * */
    val name: String = "wbc"
    val length = name.run { length }
    println(length)
    /**
     *@kotlin.internal.InlineOnly
     * public inline fun <T, R> with(receiver: T, block: T.() -> R): R {
     *     contract {
     *         callsInPlace(block, InvocationKind.EXACTLY_ONCE)
     *     }
     *     return receiver.block()
     * }
     *
     * 特点：
     *  有两个参数，
     * 1.第一个是 调用者  T
     * 2. 第二个是函数类型对象，作为扩展函数因此，可以在代码块内使用 this
     * 3. 最后一行 作为函数的返回值
     *
     * 理解：
     * 它用于在指定的对象上执行一系列操作，而不需要重复引用该对象的名称
     * */
    val man: String = "man,what can i say"
    println(with(man) {
        length
    })
    /**
     *@kotlin.internal.InlineOnly
     * @SinceKotlin("1.1")
     * public inline fun <T> T.also(block: (T) -> Unit): T {
     *     contract {
     *         callsInPlace(block, InvocationKind.EXACTLY_ONCE)
     *     }
     *     block(this)
     *     return this
     * }
     *
     * 特点：
     * 1. 接收一个作为函数类型对象，参数为 调用者，默认使用在代码块中it代替
     * 2. 返回这个调用者本身
     *
     * 理解:
     * 它允许你在对象上执行一系列操作，并返回该对象本身
     * */
    val kobe = "I Am Kobe"
    println(kobe.also { println(it.toLowerCase()) }.also { println(it.length) })

    /**
     *@kotlin.internal.InlineOnly
     * @SinceKotlin("1.1")
     * public inline fun <T> T.takeIf(predicate: (T) -> Boolean): T? {
     *     contract {
     *         callsInPlace(predicate, InvocationKind.EXACTLY_ONCE)
     *     }
     *     return if (predicate(this)) this else null
     * }
     *
     * 特点：
     * 1. 返回调用者（是可空类型）
     * 2. 函数类型的对象返回 Boolean值
     *
     * 理解：
     * takeIf 函数是 Kotlin 标准库中的一个函数，它用于对对象进行条件判断，如果符合条件，则返回原始对象，否则返回 null。
     * */
    val str: String? = "Hello"
    val result = str?.takeIf { it.length > 5 }
    println(result)

    /**
     * @kotlin.internal.InlineOnly
     * @SinceKotlin("1.1")
     * public inline fun <T> T.takeUnless(predicate: (T) -> Boolean): T? {
     *     contract {
     *         callsInPlace(predicate, InvocationKind.EXACTLY_ONCE)
     *     }
     *     return if (!predicate(this)) this else null
     * }
     *
     * 特点：
     *1. 返回调用者（是可空类型）
     *2.
     *
     * 理解：
     * 用于对对象进行条件判断，如果符合条件，则返回 null，否则返回原始对象
     * */
    val str1: String? = "Hello"
    val result1 = str1?.takeUnless { it.length > 5 }
    println(result1)
    /**
     * @kotlin.internal.InlineOnly
     * public inline fun repeat(times: Int, action: (Int) -> Unit) {
     *     contract { callsInPlace(action) }
     *
     *     for (index in 0 until times) {
     *         action(index)
     *     }
     * }
     *
     * 特点：
     * 1. 返回Unit
     * 2. 参数两个： 函数类型对象，重复次数
     * */
    val pity = "What a pity"
    repeat(10) { man: Int ->
        println(pity)
    }
}