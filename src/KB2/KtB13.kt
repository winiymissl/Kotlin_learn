package KB2

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-24
 * @Description 内联函数
 *//*
* 注意：不能出现同名函数，因为在kotlin字节码中是public static final
* */
fun main() {
    method({ s: String, i: Int ->
        println("世界是一个bug")
    }, 100)
}

//如果此函数没有使用lambda作为参数，就不需要声明成内联函数
//如果此函数没有内联，在调用端会生成多个对象来完成lambda的调用，来调用（会性能损耗，产生多个对象）
//如果此函数有内联，相当于宏替换了，会把代码替换调用处，
//
/**
 * 关注kotlin字节码，用内联函数，相当于c++里面的 #define 宏定义。宏替换
 * 小结：  如果函数参数有lambda，尽量使用inline关键帧，这样内部会做优化，减少函数开辟，对象开辟的损耗
 * */
inline fun method(repo: (String, Int) -> Unit, num: Int) {
    if (num > 10) {
        repo("nian", 234)
    }
}