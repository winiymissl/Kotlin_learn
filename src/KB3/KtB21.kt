package KB3

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-25
 * kotlin空合并操作符
 */
fun main() {
    var name :String ?="haha"
    name =null;
    /**
     * 如果 xxx == null
     * 就会执行？：后面的代码
     * let+空合并操作符
     * */
    println(name?.let { "到底执不执行呢" }?:"原来你是null")
    println(name?:"是一个null")
}