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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode node = head;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0) {
            
            int sum = carry;
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            node.next = new ListNode(sum % 10);
            node = node.next;
        }

        return head.next;
        
    }
}
        // int carry = 0;
        // ListNode head = new ListNode(0);
        // ListNode next = head;
        // while(l1 != null && l2 != null){
        //     int num = l1.val + l2.val + carry;
        //     carry = num / 10;
        //     next.next = new ListNode(num % 10);
        //     next = next.next;
        //     l1 = l1.next;
        //     l2 = l2.next;
        // }

        // while(l1 != null || carry != 0) {
        //     next.next = new ListNode(l1.val + carry);
        //     carry = 0;
        //     l1 = l1.next;
        // }
        // while(l2 != null || carry != 0) {
        //     next.next = new ListNode(l2.val + carry);
        //     carry = 0;

        //     l2 = l2.next;
        // }
        // return head.next;