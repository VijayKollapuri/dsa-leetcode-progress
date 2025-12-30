class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1, j = 0, n = nums.length;
        while(i < n) {
            if(nums[i] == nums[i - 1]) i++;
            else {
                nums[++j] = nums[i++];
            }
        }
        return j+1;
    }
}