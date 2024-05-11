package KtB6

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-29
 * Kotlin 使用继承open关键字
 * is , as 关键字一般是配合子啊一起使用
 *
 * kotlin对象类的init会被放在静态代码块里面
 */
object Change {
    fun show() {
        println("这是Object ")
    }


    init {
        println("对象类的init")
    }
}

open class Person {
    open fun show() {}
}

open class Student : Person() {
    override fun show() {
        super.show()
        println("世界你好")
    }
}

//Todo kotlin的SAM
fun interface KtRun {
    fun invoke()
}

interface KtRunnable {
    fun run()
}

fun main() {
    Change.show()
    /**
     * 匿名对象表达式
     * */
    //TOdo java的接口有两种使用方式：
    //方式一
    object : Student() {

    }
    //方式二
    Runnable { }
    //Todo kotlin的接口有一种使用方式
    object : KtRunnable {
        override fun run() {

        }
    }
    //Todo kotlin 的函数式接口也可以有第二种方式，因此我认为这只是和函数式接口有关
    //这个东西和ASM有关，其实就是函数式接口
    KtRun {
    }
}