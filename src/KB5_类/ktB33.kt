package KB5_类

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-26
 * 计算属性和防范竟态条件
 */
class ktB33 {
    val number = 0
        get() = field

    //计算属性  下面这样写，get函数的field本身
    //为什么没有number属性定义？
    val numer2: Int
        get() = (1..1000).shuffled().first()




    //防范竞态条件
    var info: String? = ""

    //防范竟态条件 当你调用一个成员，这个成员 ，可能是null， 也可能是空值
    //就必须采用防范竞态条件，作为kotlin规范化
    fun show(): String {
        //一个成员可能是null或者是空值，就是用这种写法
        //这种写法，输入防范竟态条件，
        return info?.let {
            "原来你是空值"
        } ?: "原来等于null"
    }
}

fun main() {
    println(ktB33().show())
}