package reorderList;

class Solution {
    public void reorderList(ListNode head) {
        //1. slow and fast ptr to find the middle
        ListNode slow = head;
        ListNode fast = head;
        while(fast !=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //2. Make left and right list from middle
        ListNode left = head, leftT = head;
        ListNode right = slow.next;
        while(leftT != slow) {
            leftT = leftT.next;
        }
        leftT.next = null;
        //3. Reverse the right list
        ListNode curr = right, prev = null, next;
        while(curr !=null) {
            next = curr.next;
            curr.next=prev;
            prev = curr;
            curr = next;
        }
        right = prev;
        //4. Append the reverse list to left 1 by 1
        leftT = left;
        ListNode temp, nextL, nextR;
        while(leftT != null && right != null) {
            nextL = leftT.next;
            nextR = right.next;
            right.next = nextL;
            leftT.next = right;
            right = nextR;
            leftT = nextL;
        }
        head = left;
    }
}