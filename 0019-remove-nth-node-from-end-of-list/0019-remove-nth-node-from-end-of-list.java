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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        int count = 1;
        while(first.next != null) {
            first = first.next;
            count++;
        }
         
        if(n == count) {
            head = head.next;
            return head;
        }
        first = head;
        for(int i=1; i < count - n; i++){
            first = first.next;
        }

        first.next = first.next.next;
        return head;
    }
}