package KB4

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-26
 * kotlin语言的Map的创建
 */
fun main() {
    val map = mapOf<String, Double>("change" to 3.0, "wahaha" to (3.9))
    println(map)
    val mMap = mapOf(Pair("wahaha", 1432))
    //运算符重载
    mMap["change"]
    println(mMap)/*
    * map通过key找不到，不会崩，会返回null
    * */
    //方式二 getOrDefault
    println(mMap.getOrDefault("haha", 1))
    //方式三 getOrElse
    println(mMap.getOrElse("change") { -1 })
    //方式四 ，尽量不要使用，找不到变成null，给一个值，总好一些吧
    println(mMap.get("hah"))
    // 会崩溃
//    mMap.getValue("Derru")

    //最好使用方式二和方式三
    /**
     * map的遍历
     * */
    //第一种
    mMap.forEach {
        println(it.key + it.value)
    }
    //这种是类似于解构的写法
    mMap.forEach { (k, v) ->
    }
    //第二种方式
    for (item in map) {
        println(item.key + item.value)
    }
    val mutableMapOf = mutableMapOf("askdfasdfa" to 234234)
    //这个方法意思是：如果整个集合里面没有FF的key，我就帮你先添加到map集合里面去，然后再从集合里获取

    mutableMapOf.getOrPut("FFF") { 1234 }
    println(mutableMapOf["FFF"])
}