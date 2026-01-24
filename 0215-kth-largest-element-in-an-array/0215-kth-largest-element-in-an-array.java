class Solution {
    public int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);

    for(int i : nums) {
        q.offer(i);
        if(q.size() > k) {
            q.poll();
        }
    }

    return q.peek();

    // for(int i : nums) {
    //     q.add(i);
    // }

    // int count = 1;
    // while(count != k && !q.isEmpty()) {
    //     q.poll();
    //     count++;
    // }
    // return q.poll();

    }
}