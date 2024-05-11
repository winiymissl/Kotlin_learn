package 学生管理系统.teacher

import 学生管理系统.student.Student

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-05-11
 */
class HeadTeacher : AbsTeacher() {
    val context: Context = Context
    override fun queryStudent(student: Student): Student? {
        return context.studentList.get(student.name)
    }

    fun getSubjective(): Teachers {
        return Teachers.Head
    }


    override fun addStudent(student: Student) {
        student?.let {
            context.studentList.put(student.name, student)
        }
    }

    override fun delStudent(student: Student) {
        student?.let { context.studentList.remove(student.name) }
    }

    override fun printAll() {
        context?.let {
            println(it.studentList)
        }
    }
}