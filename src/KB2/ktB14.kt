package KB2

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-24
 * @Description 函数引用
 */
/**
 * 在 Kotlin 中，函数类型的对象指的是可以存储函数引用的变量。
 * 在 Kotlin 中，函数类型本身就是一种类型，
 * 因此可以声明变量来存储函数类型的值，这些值实际上是函数的引用。
 * 这些变量可以像普通变量一样传递、存储和操作，它们可以作为函数的参数传递、
 * 作为函数的返回值返回，甚至可以在运行时进行动态创建和修改。
 * */
fun main() {
    /**
     * 将函数转换成函数类型的对象
     * */
    val obj = ::methodMain
    println(obj)
    methodMain("wbc", 999999999, method = ::method)
    methodMain("wbc", 999999999, ::method)
    /**
     * 为什么要变化函数类型的对象？
     * 因为lambda就是一个函数类型的对象，这样做只是为了
     * */
}

private fun method(name: String, age: Int): String {
    return "我是小小的method"
}

private fun methodMain(name: String, num: Int, method: (String, Int) -> String): String {
    return "函数输入的是  ： name :  $name  num  :  $num"
}
