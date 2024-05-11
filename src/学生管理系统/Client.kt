package 学生管理系统

import 学生管理系统.student.Student
import 学生管理系统.teacher.Context
import 学生管理系统.teacher.HeadTeacher

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-05-11
 */

fun main() {
    val headTeacher = HeadTeacher()
    while (true) {
        println(
            "*********************************************************************\n" + "*                         kotlin 学生管理系统                         *\n" + "*                          1. 增加学生信息                            *\n" + "*                          2. 删除学生信息                            *\n" + "*                          3. 打印学生信息                            *\n" + "*********************************************************************\n"
        )
        val num = try {
            readLine()!!.toInt() ?: 0
        } catch (e: Exception) {
            main()
        }
        when (num) {
            1 -> {
                println("请输入学生姓名")
                val name = readLine()!!
                println("请输入学生年龄")
                val age = readLine()!!.toInt()
                println("请输入学生语文成绩")
                val chinese = readLine()!!.toFloat()
                println("请输入学生数学成绩")
                val math = readLine()!!.toFloat()
                println("请输入学生英语成绩")
                val english = readLine()!!.toFloat()
                println("请输入学生班级")
                val stuClass = readLine()!!.toInt()
                val student = Student(
                    name, age, chinese, math, english, stuClass, headTeacher
                )
                Context.studentList.add(student)
            }

            2 -> {
                println("请输入要删除的学生姓名")
                val name = readLine()!!
                headTeacher.delStudent(name)
            }

            3 -> {
                headTeacher.printAll()
            }

            else -> println("输入错误")
        }
    }
}