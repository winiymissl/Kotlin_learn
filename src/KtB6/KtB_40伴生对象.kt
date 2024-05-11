package KtB6

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-29
 * 伴生对象
 */
class S {
    /**
     * 伴生对象很大程度上和java的这种static静态差不多
     * 可以直接看作static来使用
     *
     * 这里和对象类做一个区别，因为对象类是不会
     * */
    companion object {
        val info = "man，what can i say"

    }
}

fun main() {
    val value = object : Comparator<S> {
        override fun compare(o1: S?, o2: S?): Int {
            return 8
        }
    }
    S.info
    //Todo 无论对象创建几次，伴生对象只会初始化一次
}