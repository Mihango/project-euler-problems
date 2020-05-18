package labs.khobfa

import kotlin.math.sqrt


fun main() {
    var sum: Long = 0
    for (i in 0..1999999)
        if (isPrime(i.toLong()))
            sum += i.toLong()
    println(sum)

    println(" Sum >>> ${primeNumbersSummation(2_000_000)}")
}

fun isPrime(n: Long): Boolean {
    if (n < 2) return false else if (n == 2L) return true
    var i = 2
    while (i < Math.pow(n.toDouble(), 0.5) + 1) {
        if (n % i == 0L) return false
        i++
    }
    return true
}

fun primeNumbersSummation(end: Long): Long {
    var sum = 0L

    for(i in 2L until end) {
        var isPrime = true
        var sqrt = sqrt(i.toDouble())
        for (divisor in 2L..sqrt.toLong()) {
            if(i % divisor == 0L) {
                isPrime = false
                break
            }
        }

        if(isPrime) {
            sum += i
        }
    }
    return sum.toLong()
}


//
//import kotlin.math.sqrt
//
//fun main() {
//    val n = 2_000_000L
//    println("Sum of primenumbers below $n = ${primeNumbersSummation(n)}")
//}
//