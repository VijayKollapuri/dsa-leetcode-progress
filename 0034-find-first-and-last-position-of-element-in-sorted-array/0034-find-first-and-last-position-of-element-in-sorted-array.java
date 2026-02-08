class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length == 0) return new int[]{-1, -1};

        int i = 0, j = nums.length - 1;
        while(i <= j) {
            int mid = i + (j - i)/2;
            if(nums[mid] == target) {
                while(i <= j && nums[i] != target) i++;
                while(i <= j && nums[j] != target) j--;
                return new int[]{i, j};
            } else if(nums[mid] > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[]{-1,-1};

    }
}