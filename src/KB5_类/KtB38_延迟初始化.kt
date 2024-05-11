package KB5_类

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-29
 */
class Kobe {
    lateinit var name: String//等一会再来初始化，我先定义再说

    /*
    * 等你使用它的时候才会加载
    * */
    val data by lazy {
        "change"
    }
}

fun main() {

}