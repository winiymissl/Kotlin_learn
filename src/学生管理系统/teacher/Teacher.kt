package 学生管理系统.teacher

import 学生管理系统.student.Student

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-05-11
 */
interface Teacher {
    fun queryStudent(name: String): Student?
    fun addStudent(student: Student): Boolean
    fun delStudent(name: String): Boolean
    fun rank(student: Student): Int
    fun printAll()
}