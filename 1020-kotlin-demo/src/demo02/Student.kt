package demo02

// 将参数写到这，就无法自定义get和set了
class Student (var name: String, var age: Int = 18) {

}

class Teacher{
    // 需要初始化
    // lateinit允许在使用这个变量前延迟初始化
    lateinit var name: String
    var age: Int = 0
}

class A(name: String, age: Int){
    // 需要初始化
    var name: String = name
    var age: Int = age
}