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
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        else if(head.next == null) return head;
        ArrayDeque<ListNode> q = new ArrayDeque<>();
        ListNode temp = head;
        while(temp != null) {
            q.add(temp);
            temp = temp.next;
        }

        ListNode n1 = q.removeFirst();
        ListNode n2 = q.removeFirst();
        head = n2;
        temp = head;
        temp.next = n1;
        temp = temp.next;

        while(!q.isEmpty()) {
            n1 = (!q.isEmpty()) ? q.removeFirst() : null;
            n2 = (!q.isEmpty()) ? q.removeFirst() : null;
            if(n1 == null || n2 == null) break;
            temp.next = n2;
            temp = temp.next;
            temp.next = n1;
            temp = temp.next;
        }

        temp.next = n1;
        temp = temp.next;
        temp.next = null;
        return head;
    }
}