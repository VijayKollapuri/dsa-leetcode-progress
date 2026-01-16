
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k <= 1) return head;

        ListNode temp = head;
        int count = 0;
        while(temp != null) {
            temp = temp.next;
            count++;
        }

        if(k > count) return head;

        temp = head;
        count = 0;

        ArrayDeque<ListNode> q = new ArrayDeque<>();

        // Collect the first k nodes
        while(count < k) {
            q.add(temp);
            temp = temp.next;
            count++;
        }

        ListNode tail = new ListNode(0);
        head = tail;

        // (Optional consistency) Null next before linking the first node of the first reversed group
        // ListNode first = q.removeLast();
        // first.next = null;            // <-- OPTIONAL but safe
        // tail.next = first;
        // tail = tail.next;

        // If you keep it as-is, it's still okay, but nulling is safer:
        tail.next = q.removeLast();     // (optional) set removed.next = null before attaching
        tail = tail.next;

        while(!q.isEmpty()) {
            ListNode temp1 = q.removeLast();
            temp1.next = null;          // ✅ Break stale links
            tail.next = temp1;
            tail = tail.next;
        }

        while(temp != null) {
            q.add(temp);

            if(q.size() == k) {
                // ✅ IMPORTANT FIX: Cache the next traversal node BEFORE draining/reversing.
                //    Because while draining we set temp1.next = null on nodes that could include 'temp',
                //    we must not rely on 'temp.next' after that.
                ListNode next = temp.next;   // <-- ADD THIS LINE

                while(!q.isEmpty()) {
                    ListNode temp1 = q.removeLast();
                    temp1.next = null;       // ✅ Break stale links
                    tail.next = temp1;
                    tail = tail.next;
                }

                // ✅ Resume traversal from the cached next
                temp = next;                  // <-- REPLACE `temp = temp.next;` with this
                continue;                     // (optional) clarity
            }

            // ❗ This line is unsafe unless we used the cached 'next' above in the k-sized case.
            temp = temp.next;                 // stays as-is; for non-k-sized accumulation this is safe
        }

        // Drain leftover (<k) nodes in original order
        while(!q.isEmpty()) {
            ListNode temp1 = q.removeFirst();
            temp1.next = null;                // ✅ Add this to avoid stale links
            tail.next = temp1;
            tail = tail.next;
        }

        tail.next = null; // ✅ proper termination
        return head.next; // ✅ using the dummy
    }
}
