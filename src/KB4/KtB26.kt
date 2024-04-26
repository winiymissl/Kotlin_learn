package KB4

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-26
 * kotlin的集合
 */
fun main() {
    val list = listOf("man", "what", "can", "i", "say")
    val list1 = mutableListOf("man", "what", "can", "i", "say")
    println(list1[0])
    list1 += "man"//运算符重载
    println(list1)
    /**
     * 遍历方式
     * */

    //ToDo 第一种方式
    for (i in list1) {
        print(i)
    }
    println()
    //ToDo 第二种方式
    list1.forEach {
        print(it)
    }
    println()
    //ToDo 第三种方式
    list.forEachIndexed { index, s ->
        print("   下标 ： $index,  元素  ：  $s")
    }
}