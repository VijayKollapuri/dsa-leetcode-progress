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
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;     // builder pointer (instead of moving dummy)
        ListNode prev = head;      // traversal pointer

        while (prev != null) {

            // Case 1: Current node is unique
            if (prev.next == null || prev.val != prev.next.val) {
                tail.next = prev;      // attach to result
                tail = tail.next;     // move builder forward
                prev = prev.next;     // move traversal forward
            }
            // Case 2: Duplicate block found
            else {
                int dupVal = prev.val;

                // Skip entire duplicate block
                while (prev != null && prev.val == dupVal) {
                    prev = prev.next;
                }
            }
        }

        tail.next = null;   // important to avoid leftover links
        return dummy.next;
    }
}

// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         if(head == null || head.next == null) return head;
       
//         ListNode dummy = new ListNode(0);
//         ListNode prev = dummy;
//         ListNode temp = head;
//         int val = 0;
//         while(temp != null) {
//             if (temp.next == null || temp.val != temp.next.val) {
//                 if(temp.val == val) continue;;
//                 prev.next = temp;
//                 prev = prev.next;
//                 temp = temp.next;
//             } else {
//                  val = temp.val;
//                 while(temp != null && temp.val == val) {
//                     temp = temp.next;
//                 }
//             }
//     }
//             return dummy.next;
// }
// }