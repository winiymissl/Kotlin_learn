package KB

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-24
 */
fun main() {
    /**
     * when表达时
     * Any 相当于是Object
     * */
    var a = 100
    var value: Any = when (a) {
        1 -> "世界你好"
        100 -> println("值为100")
        else -> {
            println("世界不好")
        }
    }
    println(value)
    /**
     * range表达式
     * */
    var number = 100
    if (number in 1..100) {
        println("number 在1 .。100 ，number = $number")
    }
    /**
     * kotlin语言的具名函数参数
     * */
    sayName(age = 60.0, name = "张三")
    /**
     * unit函数的特点
     * Unit是一个单例类，相当于java语言的void关键字 忽略类型
     * */
    println(unitThing())
    println(unitThing2())
    println(unitThing3())
    /**
     * Nothing类型的特点
     * */
    println(show(-1))
}

private fun show(number: Int) {

    when (number) {
        -1 -> TODO("没有这种分数")
        in 100..100 -> println("世界年你好")
    }
}

private fun unitThing(): Unit {
    return println(" 返回的是Unit")
}

private fun unitThing2() {
    return println(" 无显式声明 ")
}

private fun unitThing3() {
    println(" 无return ")
}

/*
* kotlin的函数更加规范，现有输入，再有输出
* */

fun toDo(name: String, age: Int = 100): Int {

    return 1
}

private fun toDo(name: String, age: Double = 100.0): Int {

    return 1
}

private fun sayName(name: String, age: Double = 100.0) {
    println("名字是 ： ${name} 年龄是 ：${age}")
}