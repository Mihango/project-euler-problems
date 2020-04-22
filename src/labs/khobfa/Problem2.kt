package labs.khobfa

fun main() {
    println("fibonacci 5 ${fibonacciRecursive(10)}")
    println("fibonacci 5 ${fibonacciOptimized(10)}")
    println("fibonacci 5 ${sumEvenFibonacci(3_999_999)}")
    println("fibonacci 5 ${sumOddFibonacci(10)}")
}

fun fibonacciRecursive(n: Int): Int {
    if(n <= 1)
        return n
    return fibonacciRecursive(n-1) + fibonacciRecursive(n-2)
}

fun fibonacciOptimized(n: Int): Int {
    var a = 0
    var b = 1
    var c: Int

    if (n == 0) return a
    for (i in 2..n) {
        c = a + b
        a = b
        b = c
    }
    return b
}

fun sumEvenFibonacci(n: Int): Int {
    var a = 1
    print("$a, ")
    var b = 2
    print("$b, ")
    var c: Int = 0
    var sum: Int = 2

    while (c <= n) {
        c = a + b
        a = b
        b = c
        if(c % 2 ==0) {
            sum += b
        }
    }
    return sum
}

fun sumOddFibonacci(n: Int): Int {
    var a = 0
    var b = 1
    var c: Int
    var sum:Int = 0
    for (i in 2..n) {
        c = a+b
        a = b
        b = c
        if(c % 2 != 0) {
            sum += c
        }
    }
    return sum
}