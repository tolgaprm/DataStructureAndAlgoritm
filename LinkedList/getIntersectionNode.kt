fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
    var firstPointer = headA
    var secondPointer = headB

    while (firstPointer != secondPointer) {
        firstPointer = if (firstPointer != null) firstPointer.next else headB
        secondPointer = if (secondPointer != null) secondPointer.next else headA
    }
    return firstPointer
}