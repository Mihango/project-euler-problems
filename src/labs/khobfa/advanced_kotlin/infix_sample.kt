package labs.khobfa.advanced_kotlin

fun main() {
    println("Boy" plural "s")
    println(NumericHolder(12, 23) + (NumericHolder(23, 12)))
}

infix fun String.plural(suffix: String): String {
    return this + suffix
}

data class NumericHolder(val a: Int, val b: Int)

operator fun NumericHolder.plus(other: NumericHolder): NumericHolder {
    return NumericHolder(a + other.a, b + other.b)
}