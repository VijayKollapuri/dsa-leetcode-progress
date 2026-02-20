class Solution {
    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE, sum = 0;
        for(int n : nums) {
            sum = Math.max(n, sum + n);
            res = Math.max(sum, res);
        }
        return res;
    }
}