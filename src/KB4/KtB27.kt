package KB4

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-26
 * 解构语法
 * 集合配合解构语法
 */
fun main() {
    val list = listOf("李世民", "李元霸", "历史是")
    val (_, c2, c3) = list
    /**
     * 下划线不是 变量名，是用过滤解构赋值的
     * 使用下划线可以不接收赋值，可以节约一点性能
     * */

}