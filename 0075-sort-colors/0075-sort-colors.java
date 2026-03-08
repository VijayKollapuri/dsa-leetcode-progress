class Solution {
    public void sortColors(int[] nums) {
        // int[] freq = {0, 0, 0};
        // for(int i : nums) freq[i]++;

        // int j = 0; 
        // for(int i=0; i<3; i++) {
        //     while(freq[i] > 0) {
        //         nums[j++] = i;
        //         freq[i]--;
        //     }
        // }

        int i = 0, j = 0, k = nums.length - 1;
        while(j <= k) {
            if(nums[j] == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            } else if(nums[j] == 1) {
                j++;
            } else {
                int temp = nums[k];
                nums[k] = nums[j];
                nums[j] = temp;
                k--;
            }
        }
    }
}