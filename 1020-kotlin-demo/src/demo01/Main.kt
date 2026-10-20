package demo01

fun main() {
    // println("Hello, World!")
    t06()
}

fun t07(){
    
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