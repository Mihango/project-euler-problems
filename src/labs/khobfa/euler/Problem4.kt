package labs.khobfa

// find largest palindrome product of two3-digit number
fun main() {
    // println("Palindrome product == ${findPalindromeProduct()}")
    println(reverse2(329))
//    reverse(1001)

//    val capitalCities = mapOf(
//            "Kenya" to "Nairobi"
//    )
}

fun reverse2(num: Int): Int {
    var number = num
    var reduced: Int
    var reversed = 0

    while(number > 0) {
        reduced = number % 10
        reversed = (reversed * 10) + reduced
        number /= 10
    }
    return reversed
}
fun findPalindromeProduct(): Int {
    var n = 0
    for(a in 999 downTo 100) {
        for(b in a downTo 100) {
            val x = a * b
            if (x > n) {
                val s = x.toString()
                if (s == s.reversed()) {
                    n = x;
                }
            }
            println("a >>> $b")
        }
        println(a)
    }
    return n
}

fun findPalindromeProductTwoDigit() {
    var n = 0;
    for(a in 99 downTo 10) {
        val r = n / a
        if(r >= n) {
            break
        }

        for(b in a until r -1) {

        }
    }
}

fun reverse(num: Int): Int {
    var number = num
    var reversed = 0
    var reduced: Int
    while (number > 0) {
        reduced = number % 10
        reversed = (reversed * 10) + reduced
        number /= 10
    }

    return reversed
}