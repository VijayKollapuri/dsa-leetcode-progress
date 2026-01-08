class Solution {
    public void sortColors(int[] nums) {
       int[] freq = new int[3];
       for(int i : nums){
        freq[i]++;
       }
       System.out.println(Arrays.toString(freq));
       int j = 0, n = 0;
       for(int i : freq){
        while(i != 0){
            nums[j++] = n;
            i--;
        }
        n++;
       }
    }
}