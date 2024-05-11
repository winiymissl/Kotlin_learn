package KB5_类

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-28
 *次构造函数，必须使用主构造函数的参数
 * 而且次构造函数。可以使用默认参数
 * 临时变量只能在init块里面使用
 * init{} 在运行过程中，因此相当于java的构造代码块
 */
class PersonTwoMan(name: String, age: Int) {
    //次构造函数，必须要调用主构造函数，否则不通过，
    /**
     * 为什么次构造必须调用主构造
     * 主构造统一管理，为了更好的初始化设计
     * 最终无论调用了哪一个次构造函数，一定会先使用主构造函数
     * 先调用主构造，再调用次构造
     *
     * 对于构造函数：
     * 实际上次构造函数的变量个数只能比主构造函数多，
     * 次构造函数必须使用主构造函数的变量
     * */
    init {
        /**
         * init代码块可以检验临时类型的值，进行你想要的操作
         * */
        require(name.isNotBlank()) {
            "你的name是空空如也"
        }
        require(age > 0) {
            "你tm年龄是负值"
        }
    }

    constructor(name: String) : this(name, 80) {

    }
}

class PersonTwo(_name: String) {
    //次构造函数，必须要调用主构造函数，否则不通过，
    /*
    * 为什么次构造必须调用主构造
    * 主构造统一管理，为了更好的初始化设计
    * 最终无论调用了哪一个次构造函数，一定会先使用主构造函数
    * 先调用主构造，再调用次构造
    * */
    var name = _name
        get() {
            return field
        }

    constructor(name: String, age: Int) : this(name) {

    }
}/*
* 只要调用代码块，就会调用主构造函数，所以里面的东西都可以直接使用·
* */


fun main() {
    println(PersonTwoMan("世界你好", 10))
}