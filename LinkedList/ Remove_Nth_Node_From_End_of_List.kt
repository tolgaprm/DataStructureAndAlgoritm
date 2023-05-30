data class ListNode(val value: Int){
    var next: ListNode? = null
}

fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    var previous: ListNode? = null
    var slowPointer = head
    var fastPointer = head

    for (step in 0 until n) {
        fastPointer = fastPointer?.next
    }

    while (fastPointer != null) {
        previous = slowPointer
        slowPointer = slowPointer?.next
        fastPointer = fastPointer.next
    }

    if (previous == null) {
        return head?.next
    }

    previous.next = slowPointer?.next

    return head
}