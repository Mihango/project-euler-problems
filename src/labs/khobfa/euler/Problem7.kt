package labs.khobfa

import kotlin.math.sqrt

fun main() {
    println("Position of 13 in prime numbers is ${findPositionOfPrime(13)}")
    println("Prime number at position 6 is ${findPrimeGivenPosition(10001)}")
}

fun findPositionOfPrime(n: Int): Int {
    var count = 0
    var num = 2
    while (num <= n) {
        var isPrime = true

        for (i in 2..sqrt(num.toDouble()).toInt()) {
            if(num % i == 0) {
                isPrime = false
                break
            }
        }

        if(isPrime) {
            ++count
        }
        ++num
    }
    return count
}

fun findPrimeGivenPosition(position: Int): Int {
    var found = false // num <= n

    var count = 0
    var num = 2
    var currentPrime = 0;

    while (!found) {
        var isPrime = true
        for (i in 2..sqrt(num.toDouble()).toInt()) {
            if(num % i == 0) {
                isPrime = false
                break
            }
        }

        if(isPrime) {
            count++
            currentPrime = num
            if (count == position) {
                found = true
            }
        }
        ++num
    }
    return currentPrime
}