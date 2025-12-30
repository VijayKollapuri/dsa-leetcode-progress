class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0, j = 0, n = nums.length;
        while(j < n) {
            if(nums[j] == val) j++;
            else nums[i++] = nums[j++];
        }
        return i;
    }
}