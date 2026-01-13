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
    public void reorderList(ListNode head) {

        if(head.next == null) return;

        ArrayDeque<ListNode> arr = new ArrayDeque<>();
        ListNode temp = head;
        while(temp != null) {
            arr.add(temp);
            temp = temp.next;
        }
      
        temp = head;
        int count = 0;
        while(!arr.isEmpty()) {
            if(count % 2 == 0){
            ListNode node = arr.pollFirst();
            temp.next = node;
            temp = temp.next;
            }
            else{
                ListNode node = arr.pollLast();
                temp.next = node;
                temp = temp.next;
            }
            count++;
        }
        temp.next = null;
    }
}