package 学生管理系统.teacher

import 学生管理系统.student.Student

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-05-11
 */
class HeadTeacher : AbsTeacher() {
    val context: Context = Context
    override fun queryStudent(name: String): Student? {
        return context.studentList.find { it.name == name }
    }

    fun getSubjective(): TeacherKind {
        return TeacherKind.Head
    }

    override fun addStudent(student: Student): Boolean {
        return student?.let {
            context.studentList.add(student)
        }?:false
    }

    override fun delStudent(name: String): Boolean {
        return context?.let {
            it.studentList.remove(it.studentList.find {
                it.name == name
            })
        } ?: false
    }

    override fun rank(student: Student): Int {
        context?.let {
            it.studentList.maxWith(Comparator { o1: Student, o2: Student ->
                if (o1.getSumScore() > o1.getSumScore()) {
                    1
                } else {
                    -1
                }
            })
        }
        return context.studentList.indexOf(student)
    }

    override fun printAll() {
        context?.let {
            println(it.studentList)
        }
    }

    override fun toString(): String {
        return "HeadTeacher(context=$context)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as HeadTeacher

        return context == other.context
    }

    override fun hashCode(): Int {
        return context.hashCode()
    }

}