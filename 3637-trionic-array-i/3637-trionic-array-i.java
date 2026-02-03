class Solution {
    public boolean isTrionic(int[] nums) {
        int i = 0, n = nums.length;
        while(i < n-1 &&  nums[i] < nums[i+1]) {
            i++;
        }
            if(i == 0) return false;
        int j = i;
        while(i < n-1 && nums[i] > nums[i+1]) {
            i++;
        }
         if(i == j || i == n-1) return false;
         j = i;  
        while(i < n-1 && nums[i] < nums[i + 1]) {
            i++;
        }

        if(i == j || i != n - 1) return false;

        return true;
    }
}