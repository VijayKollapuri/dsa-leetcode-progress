class Solution {
    public int minimumCost(int[] nums) {
        int res = nums[0], firstMin = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] < firstMin) {
                secondMin = firstMin;
                firstMin = nums[i];
            } else if(nums[i] < secondMin) {
                secondMin = nums[i];
            }
        }
        return res + firstMin + secondMin;
    }
}