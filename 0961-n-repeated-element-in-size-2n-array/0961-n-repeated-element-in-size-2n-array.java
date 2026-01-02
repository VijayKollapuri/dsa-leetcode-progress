class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n-1;i++) {
            if(nums[i] == nums[i+1]) return nums[i];
            else if(i + 2 < n && nums[i] == nums[i+2]) return nums[i];
        }
        // int count = n/2;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i : nums) {
        //     map.put(i, map.containsKey(i) ? map.get(i)+1 : 1);
        //     if(map.get(i) == count) return i;
        // }
        return nums[n-1];
    }
}