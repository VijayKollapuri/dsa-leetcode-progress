/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return null;
        ListNode slow = head;
        int size = 1;

        while(slow.next != null){
            slow = slow.next;
            size++;
        }
                 slow = head;
        ListNode fast = head;
        ListNode prev = head;

        while(fast.next != null && fast.next.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if((size & 1) == 1) {
        prev.next = slow.next;
        slow.next = null;
        } else {
            slow.next = slow.next.next;
        }

        return head;
    }
}