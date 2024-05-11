package KB5_类

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-27
 * 主构造函数
 */
//规范来说都是增加下划线的方式，临时的输入类型。不能直接使用
class Change(_name: String, _age: Int) {

    var name = _name
        //后备字段
        get() = field
        private set(value) {
            field = value
        }

    fun show() {
        println(name)
        //临时输入的类型。不能直接使用，需要进行接收
        //println(_name)
    }
}


fun main() {
    val change = Change("change", 14)
    change.show()

}