class Solution {
    public int scoreDifference(int[] nums) {
        int first = 0, second = 0;
        boolean firstP = true, secondP = false;
        for(int i = 0; i < nums.length; i++) {
            if((nums[i] & 1) == 1) {
                firstP = !firstP;
                secondP = !secondP;
            }

            if(((i+1)%6) == 0) {
                firstP = !firstP;
                secondP = !secondP;
            }

            if(firstP) {
                first += nums[i];
            }

            if(secondP) {
                second += nums[i];
            }
        }

        return (int)(first - second);
    }
}