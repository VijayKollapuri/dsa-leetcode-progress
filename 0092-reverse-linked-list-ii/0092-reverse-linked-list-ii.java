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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null) return head;

        int count = 1;
        ListNode temp = head;
        ArrayDeque<ListNode> q = new ArrayDeque<>();

        while(temp != null && count != left) {
            count++;
            temp = temp.next;
        }

        while(temp != null && count <= right) {
            q.push(temp);
            temp = temp.next;
            count++;
        }


        ListNode backUp = temp;
        ListNode dummy = new ListNode(0);

        temp = head;
        head = dummy;
        count = 1;
           while(temp != null && count < left) {
            dummy.next = temp;
            dummy = dummy.next;
            temp = temp.next;
            count++;
        }
        while(!q.isEmpty()) {
            ListNode i = q.pop();
            i.next = null;
            dummy.next = i;
            dummy = dummy.next;
        }

        while(backUp != null) {
            dummy.next = backUp;
            dummy = dummy.next;
            backUp = backUp.next;
        }
        
        return head.next;
        
    }
}