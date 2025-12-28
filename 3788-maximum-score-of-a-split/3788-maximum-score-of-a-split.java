class Solution {
    public long maximumScore(int[] nums) {
        int n = nums.length;
        long[] prefix = new long[n];
        long[] sufix = new long[n];

        prefix[0] = nums[0];
        sufix[n-1] = nums[n-1];
        int min = nums[n-1];

        for(int i=1; i<n-1; i++) {
            prefix[i] = nums[i] + prefix[i-1];
            if(nums[i] < min) {
                min = nums[i];
            }
        }

        for(int i = n-2; i>= 0; i--) {
            sufix[i] = Math.min(nums[i+1], sufix[i+1]);
        }

        long score = Integer.MIN_VALUE;
        long ans = 0;
        for(int i=0; i<n-1; i++){
           ans = prefix[i] - sufix[i];
           score = Math.max(ans, score); 
        }
        return score;
    }
}