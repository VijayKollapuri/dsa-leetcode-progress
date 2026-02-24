class Solution {
    public int findClosestNumber(int[] nums) {
        int res = Integer.MAX_VALUE;
        for(int i : nums) {
            int temp = Math.abs(i);
            if(temp == 0) return i;
            if(Math.abs(res) == temp) {
                res = Math.max(res, i);
            } else {
                res = temp < Math.abs(res ) ? i : res;
            }
        }
        return res;
    }
}