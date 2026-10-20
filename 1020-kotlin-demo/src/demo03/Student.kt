package demo03

//class Student () {
//    // lateinit不能修饰基本类型
//    lateinit var name: String
//    var age: Int = 0
//}

class Student (var name: String, var age: Int) {
    // 次要构造函数，每一个次要构造函数都必须调用主要构造函数
    constructor(name: String) : this(name, 0){
        println("次要构造函数")
    }
    // 在创建对象的时候进行一些操作
    init {
        println("我出生了")
    }
    fun hello(){
        println("hello")
    }
}