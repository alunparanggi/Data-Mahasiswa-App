package dao

import model.Student

class StudentDao: Dao<Student, String> {

    private var students = arrayListOf<Student>().apply {
        add(Student("Tony Stark", "1234112", "Teknik Mesin", "410A", "Marvel University"))
        add(Student("Natasha Romanof", "5432425", "Teknik Informatika", "410A", "Marvel University"))
        add(Student("Hulk", "2342534", "Teknik Sipil", "410B", "Marvel University"))
        add(Student("Loki", "2345523", "Teknik Elektro", "410A", "Marvel University"))
        add(Student("Dr. Strange", "2345523", "Teknik Sihir", "420A", "Marvel University"))
        add(Student("Thor", "2345223", "Teknik Arsitektur", "411A", "Marvel University"))
    }

    override fun getData(): List<Student> {
        return students
    }

    override fun addData(item: Student) {
        students.add(item)
    }

    override fun deleteData(uniqueID: String) {
        students.remove(students.find {
            it.nim == uniqueID
        })
    }
}