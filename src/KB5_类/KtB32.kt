package KB5_类

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-26
 */
class KtB32 {

    var name = ""
        get() = field.capitalize()
        set(value) {
            field = "$value "
        }

    var age =""
        //下面的隐式代码，写或者不写都有
        //把field看作this.变量
        get() = field
        set(age) {
            field = age
        }

}

fun main() {
    val ktB32 = KtB32()
    ktB32.name = "ke"
    println(ktB32.name)
}