class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // if(n==0) return nums1;
        // int i = 0, j = 0;
        // while(i < nums1.length && j < n) {
        //     if(nums1[i] < nums[])
        // }
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i = 0; i < nums1.length - n; i++){
            q.add(nums1[i]);
        } 
        for(int i : nums2) q.add(i);
        int j = q.size();
        for(int i = 0; i < j; i++) 
        nums1[i] = q.poll();

    }
}