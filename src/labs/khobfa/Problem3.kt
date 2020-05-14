package labs.khobfa

import kotlin.math.sqrt

/**
 * Find the greatest prime factor of a number
 */
fun main() {
    findPrime()
//    findPrimeFactors(600851475143)
//    println("\nLargest prime factor >>>> ${findLargestPrimeFactor(600851475143)}")
}

fun findPrimeFactors(n: Long) {
    var num = n
    val zero = 0.toLong()
    // loop - divide by 2 until the number is odd
    while (num.rem(2) == zero) {
        print("2 ")
        num /= 2
    }

    val sqrt: Double = sqrt(n.toDouble())
    for (i in 3..sqrt.toInt() step 2) {
        while (num.rem(i) == zero){
            print("$i ")
            num /= i
        }
    }

    if(num > 2) {
         print(num)
    }
}

fun findLargestPrimeFactor(n: Long): Int {
    var num = n
    val zero = 0.toLong()
    var largest = 0
    var sqrt = sqrt(n.toDouble()).toInt()

    while (num.rem(2) == zero) {
        if(largest < 2) {
            largest = 2
        }
        num /= 2
    }

    // step by 2 to ensure you loop odds only
    for (i in 3..sqrt step 2) {
        while (num.rem(i) == zero) {
            if(largest < i)
                largest = i
            num /= i
        }
    }
    if(num > largest) {
        largest = num.toInt()
    }
    return largest
}


fun findPrime() {
    var low = 1
    val high = 20
    while (low < high) {
        var flag = false

        for (i in 2..low / 2) {
            // condition for nonprime number
            if (low % i == 0) {
                flag = true
                break
            }
        }
        if (!flag && low != 0 && low != 1) print("$low ")
        ++low
    }
}