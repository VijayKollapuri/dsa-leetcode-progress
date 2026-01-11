class Solution {
    public int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> q = new PriorityQueue<Integer>((a,b) -> b - a);

    for(int i : nums) {
        q.add(i);
    }

    int count = 1;
    while(count != k && !q.isEmpty()) {
        q.poll();
        count++;
    }
    return q.poll();
    }
}