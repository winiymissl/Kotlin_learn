package 学生管理系统.teacher

import 学生管理系统.student.Student

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-05-11
 */
interface Teacher {
    fun queryStudent(student: Student): Student?
    fun addStudent(student: Student): Unit
    fun delStudent(student: Student): Unit
    fun printAll()
}