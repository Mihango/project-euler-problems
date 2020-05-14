package labs.khobfa.advanced_kotlin

fun main() {
    println("GCD 8, 12 = ${gcd(10, 4)}")
    print("${-49 % 5}")
}

fun findGCDWhile(n: Int, m: Int): Int {
    var num1 = n;
    var num2 = m;

    while(num1 != num2) {
        if(num1 > num2) {
            num1 -= num2
        } else {
            num2 -= num1
        }
    }
    return num1
}

fun gcd(a: Long, b: Long): Long {
    return if (a % b != 0L)
        gcd(b, a % b)
    else b
}