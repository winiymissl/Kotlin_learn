package KB5_类

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-28
 * 关于定义主构造函数里面的属性
 *//*
* 可以选择一步到位,直接在 参数里面给参数命名了
* */
class Person(var name: String, var age: Int) {
    fun show() {
        println(name)
    }

    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }
}

fun main() {
    var person = Person("八嘎", 18)
    println(person)
}