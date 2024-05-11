package 学生管理系统

import 学生管理系统.student.Student
import 学生管理系统.teacher.HeadTeacher

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-05-11
 */

fun main() {
    val teacher = HeadTeacher()
    var student = Student("小明", 17, 6.7f, 100f, 453f, 8, teacher)
    teacher.addStudent(student)
    teacher.printAll()
}