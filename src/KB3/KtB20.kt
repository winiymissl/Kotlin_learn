package KB3

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-25
 * kotlin的非空断言操作符
 */
fun main() {
    var name: String? = null

    /**
     * TODO
     * 意思是 ！！断言，不管name是不是null，都执行，这个和java一样了
     * 结论 ： 如果百分百保证name是有值的。那么才能使用断言！！，否则有空指针风险
     * */
    var other = name!!.let {
        it
    }
    println(other)
    /**
     * kotlin语法中对比使用if判断null值情况
     * */
    var user: String? = null
    if (user != null) {
        //TODO :  直接使用会报错，但是经过if判断就不会报错了，编译器很机智，因此if也算是补救措施，和java相同
        user.capitalize()
    }

}
