package 学生管理系统.student

import 学生管理系统.teacher.Teacher

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-05-11
 */
class Student constructor(
    var name: String,
    var age: Int,
    var chinese: Float,
    var math: Float,
    var english: Float,
    var stuClass: Int,
    var teacher: Teacher
) : AbsStudent() {
    fun getSumScore(): Float {
        return chinese + math + english
    }
    override fun printScore() =
        println(" $name  $age 岁  班级 : $stuClass  chinese : $chinese   math : $math english : $english")
    fun getRank() {
        teacher
    }

    override fun toString(): String {
        return "Student(name='$name', age=$age, chinese=$chinese, math=$math, english=$english, stuClass=$stuClass, teacher=$teacher)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Student

        if (name != other.name) return false
        if (age != other.age) return false
        if (chinese != other.chinese) return false
        if (math != other.math) return false
        if (english != other.english) return false
        if (stuClass != other.stuClass) return false
        if (teacher != other.teacher) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        result = 31 * result + chinese.hashCode()
        result = 31 * result + math.hashCode()
        result = 31 * result + english.hashCode()
        result = 31 * result + stuClass
        result = 31 * result + teacher.hashCode()
        return result
    }
}