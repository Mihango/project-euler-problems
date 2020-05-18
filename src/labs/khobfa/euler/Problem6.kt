package labs.khobfa

import kotlin.math.pow

// square of square of n number subtract sum of squares of n
fun main() {
    println("${getSquareOfSum(100) - getSumOfSquare(100)}")
    println("sum (1..20)^2 = ${getSumOfSquare(20)}")
    println("sum (1..20)^2 Recursive = ${getSumOfSquareRecursive(20)}")
}

fun getSquareOfSum(n: Int): Int {
    // sn = n(n1 + n2) / 2
    val value = n * (1 + n) / 2
    return value * value;
}

fun getSumOfSquare(n: Int): Int {
    // s(n)^2 = (n * (n+1) * (2n +1) / 6
    return (n * (n+1) * (2 * n +1)) / 6
}

fun getSumOfSquareRecursive(n: Int): Int {
    return if(n == 1) {
        n * n
    } else {
        (n * n) + getSumOfSquareRecursive(n-1)
    }
}