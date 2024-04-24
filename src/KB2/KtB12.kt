package KB2

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-24
 * @Description 函数中的函数
 * 将函数看作了接口
 */
fun main() {
    /**
     * 实质上是将定义和实现分开，将函数声明在需要
     * 算是比较漂亮的写法吧
     * 函数名出现，则是kotlin的具名函数，可以直接写{}
     */
    //方式一
    loginAPI("wbcsfasdfasdf", { result: String, num: Int ->
        println("校验完毕 结果   ：   $result , 状态码    ：  $num")
    }, "1234")
    //方式二
    loginAPI("alsdhfjkashdlfkjahsdf", responseResult = { result: String, num: Int ->
        println("校验完毕 结果   ：   $result , 状态码    ：  $num")
    }, "34123412341234")
    //方式三
    //如果函数在最后一个，那么就可以直接写在外面，按照方式一，继续写函数体
}

fun loginAPI(username: String, responseResult: (String, Int) -> Unit, userpwd: String) {
    if (username == null || userpwd == null) {
        /**
         * 报错信息
         * */
        TODO("用户名户密码为null")
    }
    /**
     * 做很多的校验
     * */
    if (username.length > 3) {
        responseResult("登录成功", 200)
    }
}