class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        int count = n/2;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            map.put(i, map.getOrDefault(i,0) + 1);
            if(map.get(i) == count) return i;
        }
        return -1;
    }
}