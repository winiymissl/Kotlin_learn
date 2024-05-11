package KB2

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-24
 * @Description 匿名函数
 */
fun main() {
    var lengh = "Derry".count()

    var length2 = "Change".count {
        /**
         * it 相当于是 change 其中的每一次字符，都进行比较
         * */
        it == 'r'
    }
    println(lengh)
    /**
     * 函数类型和隐式返回
     * */
    //函数的声明
    val methodAction: () -> String
    val func: () -> String = {
        "man"
    }
    //第二步 对上面函数的实现
    methodAction = {
        val inputValue = 999/*
        * 匿名函数不写return 最后一行就是返回值
        * 最后一行就是return
        * 这就是隐式返回
        *  */
        "Derry[$inputValue]"
    }
    println(methodAction())
    /**
     * 函数参数的学习
     * 第一步和第二步的合并
     * */
    val myMethod: (Int, Int, Int) -> String = { number1, numer, number3 ->
        "参数一："
    }
}
/*
* fun methodAction ():String{
* return ”哈哈“
* }
* */