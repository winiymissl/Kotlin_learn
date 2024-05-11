package KtB6

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-29
 */
class Body {
    val name by lazy { }


    /**
     *  lateinit var age: Int
     * 这个错误是由于在 Kotlin 中,lateinit
     * 修饰符只能用于非空引用类型(Non-null reference types)的属性,
     * 而不能用于基本数据类型(Primitive types)。

    基本数据类型包括:

    Boolean
    Byte
    Short
    Int
    Long
    Float
    Double
    Char
    这些类型在声明时必须被初始化,因为它们不能为 null。
     * */

    inner class Heart {
        var myHeart = "myHeart"
        fun show() {
            println("$name")
        }
    }

    fun showHeart() {
        println(Heart())
    }

    fun showLeftLeg() {
        println(Leg().leftLeg)
    }

    /**
     * 嵌套类
     * 默认情况下就是 嵌套类关系
     *
     * 嵌套类的特点：
     * 反编译看到就少了一个static关键字
     * */
    class Leg {
        var leftLeg: Int? = null
        fun show() {
            //Todo 此时就不可以调用 name，因为并不是内部类
//            println("$name")
        }
    }
}

fun main() {

}