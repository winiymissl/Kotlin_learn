package KB1

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-24
 * @Description kotlin语言中的反引号
 */
fun main() {
    /**第一种
     * 反引号测试
     * */
    登录功能(name = "i am diga", "100")
    /**第二种
     * in 在kotlin中是关键字
     * is 在kotlin中是关键字
     * 但是我想要调用java类怎么办？
     * 使用反引号
     * */
//    IsIn.is()
    IsIn.`in`()
    IsIn.`is`()
    /**第三种
     *用于加密公司核心代码
     * */
    `453456345745674568567`()
}

private fun `453456345745674568567`() {
    println("哈哈，函数名是数字，崩溃了吧")
}

private fun `登录功能`(name: String, pwd: String) {
    println("模拟 ： 用户名是 ： ${name}")
}