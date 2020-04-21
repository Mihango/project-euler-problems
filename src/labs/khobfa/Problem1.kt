package labs.khobfa

import kotlin.math.pow

fun main() {
    println("Sequence sum 1...10 = ${sumOfSequenceWithFirstAndLast(1,10)}")
    println("Sequence sum 1...10 = ${sumOfSequenceWithReverse(1,1000)}")
    println("Sequence sum 1...10 = ${sumOfSequence(1,10)}")
    println("Sum = ${summationMultiplesOf5And3(10)}")
    println("Sum = ${summationMultiplesOf5And3(0, 20)}")
    println("Sum = ${summationMultiplesOf5And3New( 20)}")
}

/***
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
fun summationMultiplesOf5And3(start: Int, end: Int): Int {
    var sum = 0
    for (i in start until end) {
        if (i % 3 == 0 || i % 5 == 0) {
            sum += i
        }
    }
    return sum
}

fun summationMultiplesOf5And3(end: Int): Int {
    var sum = 0
    for (i in 0 until end) {
        if (i % 3 == 0 || i % 5 == 0) {
            sum += i
        }
    }
    return sum
}

/**
 * this formula cannot work since for number multiple of 3 and 5 are counted twice
 */
fun summationMultiplesOf5And3New(end: Int): Int {
    var sum = 0
    var multiple3End = 0
    var multiple5End = 0

    for(i in end - 1 downTo end-6) {
        if(i % 3 == 0 && multiple3End == 0)
            multiple3End =i

        if(i % 5 == 0 && multiple5End == 0)
            multiple5End =i
    }
    val n3 = (multiple3End - 3) / 3 + 1
    val n5 = (multiple5End - 5) / 5 + 1
    println("3 >> $multiple3End --- $n3 >>>>>>>>>> 5 $multiple5End --- $n5")

    val total3 = ((3 + multiple3End) * n3) / 2
    val total5 = ((5 + multiple5End) * n5) / 2

    println("3 >> $multiple3End --- $n3 === $total3 >>>>>>>>>> 5 $multiple5End --- $n5 === $total5")
    sum = total3 + total5
    return sum
}


fun sumOfSequence(start: Int, end: Int):Int {
    var sum = 0
    for (i in start..end) {
        sum += i
    }
    return sum;
}

/**
 * To find sum of a sequence - by having a column of reversed number and adding totals
 * they all result to same value
 * To get sum multiply by n and divide by 2
 *
 * use formula n/2(start + end)
 */
fun sumOfSequenceWithReverse(start: Int, end: Int): Int {
//    val total = start + end;
    val n = end - start + 1
    return (start + end) * n / 2
}

fun sumOfSequenceWithFirstAndLast(start: Int, end: Int): Int {
    val squareLast = (end.toDouble().pow(2.toDouble())).toInt()
    val squareStart = (start.toDouble().pow(2.toDouble())).toInt()
    val minus = squareLast - squareStart
    return (minus + start + end) / 2
}