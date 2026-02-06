class Solution {
    public int firstMissingPositive(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i : nums) {
            if(i > max) max = i;
        }

        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i : nums) {
            map.put(i, true);
        }

        for(int i = 1; i <= Math.abs(max-1); i++) {
            if(!map.containsKey(i)) {
                return i;
            }
        }

        return max + 1;
    }
}