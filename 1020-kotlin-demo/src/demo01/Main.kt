package demo01

// 顶层变量
var a: Int = 10
    // 自定义getter
    // field才是值本身
    get() = field * 10
    set(value) {
        field = value * 10
    }

// 函数类型别名
typealias Type = (String) -> Unit

fun main() {
    // println("Hello, World!")
    t11()
}

/**
 * 内联函数
 */
fun t11(){
    // 这里的调用类似于将test1函数的代码直接复制到这里
    test2{
        println("打印:${it}")
    }
}
inline fun test2(func:(String)-> Unit){
    println("这是一个内联函数")
    func("你好世界")
}

/**
 * Lambda表达式
 */
fun t10() {
    val func1: (String) -> Int = {
        println(it)
        10
    }
    func1("Hello, World!")
    test1 {
        println(it) // Hello, kotlin!
        20
    }
    val func2: (Int) -> String = test@{
        if (it > 10) return@test "你好"
        println("我是正常情况")
        // 分不清是t10函数的return还是func2函数的return，所以需要打标签
        "收到正常参数${it}"
    }
    println(func2(10))
}

fun test1(func: (String) -> Int) {
    println(func("Hello, kotlin!")) // 20
}


/**
 * 函数类型变量
 */
fun t09() {
    val func: (String) -> Int

    // 表示test函数接受一个函数作为参数，这个函数的参数是一个String，返回一个Int
    fun test(func: (String) -> Int) {}
    // 函数套函数
    val func1: (String) -> (() -> Unit)
    // 使用别名
    val func2: Type
    fun test1(str: String): Int {
        return 666
    }
    // 当两个函数的参数列表和返回类型相同时，可以使用::操作符引用test1函数，此时func3和test1函数等价
    val func3: (String) -> Int = ::test1
    println(func3(""))
    // 使用匿名函数
    val func4: (String) -> Int = fun(str: String): Int {
        return 10
    }
    println(func4(""))
}

/**
 * 读取用户输入
 */
fun t08() {
    // 等待用户输入
    val input: String = readln()
    println("You input: $input")
}

/**
 * 顶层变量
 */
fun t07() {
    println(a)
    println(a * 9)
}

/**
 * 函数
 */
fun t06() {
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    // println(sum(1, 2))
    // 函数默认值
    fun send(message: String = "Hello, World!") {
        println(message)
    }
    send()
    send("Hello, Kotlin!")
    // 可以简写为
    fun simpleSum(a: Int, b: Int): Int = a + b
    println(simpleSum(1, 3))
    // 匿名函数
    val result = fun(a: Int, b: Int): Int = a + b
    println(result(1, 2))
}

/**
 * while
 */
fun t05() {
    var i = 100
    while (i > 0) {
        // println(i)
        i /= 2
    }
    var j = 1
    do {
        println(j)
        j *= 2
    } while (j <= 200)
}

/**
 * for
 */
fun t04() {
    val range1 = 1..10 step 2
    // for (i in range1) println(i)
    val range2 = 10 downTo 1 step 2
    // for (i in range2) println(i)
    for (i in range1) {
        if (i % 2 == 0) continue
        if (i == 7) break
        // println(i)
    }
    circle1@ for (i in 1..5) {
        circle2@ for (j in 1..3) {
            if (i == 2 && j == 2) continue@circle2
            println("i = $i, j = $j")
        }
    }
}

/**
 * when
 */
fun t03() {
    val c = 'D'
    var result = when (c) {
        'A' -> println("A")
        'B', 'C' -> println("B")
        else -> 123
    }
    println(result)
    val score = 10
    val grade = when (score) {
        // 使用in判断是否在指定区间内
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        in 60..69 -> 'D'
        !in 60..100 -> 'F'
        else -> "Error"
    }
    println(grade)
}

/**
 * if
 */
fun t02() {
    val a = 10
    // 类似三元运算符
    if (a > 0) println("a is positive") else println("a is non-positive")
    val score = 100
    // 使用if赋值
    var str = if (score >= 60) "Pass" else "Fail"
    println(str)
}

/**
 * 数字类型
 */
fun t01() {
    // 这里的变量类型可以自动推断，可以省略 Int
    // var x: Int = 10
    var x = 10
    var a: Long = 10L
    var b: Byte = 1
    var pi: Double = 3.14
    var e: Float = 2.7f
}