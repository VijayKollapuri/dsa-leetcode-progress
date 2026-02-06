class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] seen = new boolean[nums.length + 1];
        for(int i : nums) {
            if(seen[i]) return i;
            seen[i] = true;
        }
        // HashSet<Integer> set = new HashSet<>();
        // for(int i : nums) {
        //     if(set.contains(i)) return i;
        //     set.add(i);
        // }
        return -1;
        
    }
}