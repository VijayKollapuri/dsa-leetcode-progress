class Solution {
    public int[] runningSum(int[] nums) {
         int[] res = new int[nums.length];
         res[0] = nums[0];
        // for(int i = 1; i < nums.length; i++) {
        //     res[i] = res[i - 1] + nums[i];
        // }
        // return res;

        IntStream.range(1, nums.length)
                 .forEach(i -> res[i] = res[i - 1] + nums[i]);

return res;
    }
}