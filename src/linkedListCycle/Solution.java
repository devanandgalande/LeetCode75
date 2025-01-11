package linkedListCycle;

class Solution {
    public boolean hasCycle(ListNode head) {
        //1. slow and fast ptr to find the middle
        ListNode slow = head, fast = head;
        while(fast != null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}