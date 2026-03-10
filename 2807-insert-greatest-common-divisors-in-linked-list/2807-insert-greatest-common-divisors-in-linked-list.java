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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null) return head;
        ListNode cur = head, nxt = head.next;
        while(nxt != null) {
            int n = gcd(cur.val, nxt.val);
            ListNode temp = new ListNode(n);
            temp.next = nxt;
            cur.next = temp;
            nxt = nxt.next;
            cur = cur.next.next;
        }

        return head;
    }

    private static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}