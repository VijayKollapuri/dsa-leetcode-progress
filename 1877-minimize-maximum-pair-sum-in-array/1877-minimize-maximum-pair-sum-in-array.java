class Solution {
    public int minPairSum(int[] nums) {
        if(nums.length <= 1) return 0;
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        int result = Integer.MIN_VALUE;

        while(i < j) {
            result = Math.max(result, (nums[j--] + nums[i++]));
        }
        return result;
    }
}