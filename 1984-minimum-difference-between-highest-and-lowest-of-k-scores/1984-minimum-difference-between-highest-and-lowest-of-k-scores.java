class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k == 1) return 0;
        Arrays.sort(nums);

        int result = Integer.MAX_VALUE;

        int i = 0, j = k - 1;
        
        while(j < nums.length) {
            result = Math.min(result, nums[j++] - nums[i++]);

        }
        return result;

    }
}