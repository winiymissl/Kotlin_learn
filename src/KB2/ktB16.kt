package KB2

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-24
 * @Description kotlin语言的匿名函数和具名函数
 */
fun main() {
    /*
    * 挺抽象的，应该算是
    * */
    methodWay(" hello world", 100, myMethod = ::myMethodImpl)
    /**
     * kotlin中似乎函数是一个抽象的东西，只要有了参数，返回值，一个函数名，就是一个函数了就可以引用这个函数
     * 不要在java的坑里待得太久
     * */
}

fun myMethodImpl(name: String, num: Int) {

}

//这里的method理解为函数的参数,因此你重新定义一个函数，也可以代替其原来的参数啊
//只能说Andrey Breslav有点nb
fun methodWay(name: String, user: Int, myMethod: (String, Int) -> Unit) {
    println("the answer :  name:  $name , user  :  $user")
    myMethod.invoke("mehodWay", 100)
}