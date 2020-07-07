package labs.khobfa

data class ListNode(var value: Int, var next: ListNode? = null) {
    override fun toString(): String {
        return "ListNode{" +
                "val=" + value +
                ", next=" + next +
                '}'
    }
}

fun doWork(node: ListNode): ListNode {
    // change value
    node.value = 23
    println("in do work >>>> $node")
    println("n in do work >>>> $node")
    return node
}

fun main() {
    val next = ListNode(34)
    val preHead = ListNode(-1, next)

    println(preHead)
    println("prev before doWork >>> $preHead")
    doWork(preHead)
    println("prev after doWork >>> $preHead")
    println("preHead after doWork >>> $preHead")
}