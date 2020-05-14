package labs.khobfa.advanced_kotlin

import kotlin.math.max

fun  main() {
//    println("LCM of 8 and 9 Iteratively == ${findLcm(6,9)}")
//
//    println("LCM of 8 and 9 Recursively == ${findLcmRecursively(6,9)}")

    println("LCM of numbers 1..4 >>>> ${findLcmWithGcd(20)}")
}

fun findLcm(num: Int, num2: Int): Int {
    var lcm = max(num, num2)

    while (true) {
        if(lcm % num == 0 && lcm % num2 == 0) {
            break
        }
        ++lcm
    }
    return lcm
}

fun findLcmRecursively(num: Int, num2: Int): Int {
    return findLcmRecursively(num, num2, max(num, num2))
}

fun findLcmRecursively(num: Int, num2: Int, lcm: Int): Int {
    if(lcm % num == 0 && lcm % num2 == 0) {
        return lcm
    }
    return findLcmRecursively(num, num2, lcm+1);
}

fun findLcmWithGcd(n: Long): Long {
    var lcm = 1L
    for (i in 1..n) {
        lcm = (i * lcm) / gcd(lcm, i)
    }

    return lcm
}