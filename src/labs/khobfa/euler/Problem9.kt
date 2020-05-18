package labs.khobfa

import kotlin.math.pow


fun main() {
    findPythogremTriple(1000)
}

fun findPythogremTriple(value: Int) {
    for(a in 3..value) {
        for(b in a+1 until value) {
            val cSquared: Double = a.toDouble().pow(2.0) + b.toDouble().pow(2.0)
            val c = Math.pow(cSquared, 0.5)

            if((a + b + c) == 1000.toDouble()) {
                print("$a * $b * $c = ${a * b * c}")
                break
            }
        }
    }
}


