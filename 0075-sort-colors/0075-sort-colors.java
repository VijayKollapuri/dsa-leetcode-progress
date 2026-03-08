class Solution {
    public void sortColors(int[] nums) {
        int[] freq = {0, 0, 0};
        for(int i : nums) freq[i]++;

        int j = 0; 
        for(int i=0; i<3; i++) {
            while(freq[i] > 0) {
                nums[j++] = i;
                freq[i]--;
            }
        }
    }
}