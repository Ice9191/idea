package demo03

fun main(){
    val student = Student("小明", 18)
    student.name = "小红"
    println(student.name)
    println(student.age)
    val student1 = Student("明明")
    student.hello()
}