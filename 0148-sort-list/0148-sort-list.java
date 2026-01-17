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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        PriorityQueue<ListNode> q = new PriorityQueue<>((a, b) -> a.val - b.val);
        ListNode temp = head;
        while(temp != null) {
            q.add(temp);
            temp = temp.next;
        }

        ListNode dummy = new ListNode(0);
        head = dummy;
        temp = q.poll();
        temp.next = null;
        dummy.next = temp;
        dummy = dummy.next;
        while(!q.isEmpty()) {
            temp = q.poll();
        temp.next = null;
        dummy.next = temp;
        dummy = dummy.next;
        }
        return head.next;
    }
}