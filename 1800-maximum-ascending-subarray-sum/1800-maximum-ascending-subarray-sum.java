class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = nums[0], curSum = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i - 1]) {
                curSum += nums[i];
                maxSum = curSum > maxSum ? curSum : maxSum;
            } else {
                curSum = nums[i];
            }
        }

        // boolean isAsc = false;
        // while(i < nums.length) {
        //     if(i > 0 && nums[i] < nums[i-1]) {
        //         isAsc = true;
        //     } else isAsc = false;

        //     if(isAsc) {
        //         curSum = nums[i];
        //     } else {
        //         curSum += nums[i];
        //         maxSum = curSum > maxSum ? curSum : maxSum;
        //     }

        //     i++;
        // }
        return maxSum;
    }
}