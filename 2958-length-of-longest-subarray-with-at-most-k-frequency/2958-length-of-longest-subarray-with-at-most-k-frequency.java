class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int res = 0, p = 0;

        for(int i = 0; i < nums.length; i++) {
              map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            while(map.get(nums[i]) > k) {
                map.put(nums[p], map.get(nums[p]) - 1);
                p++;
            }
            res = Math.max(res, (i - p) + 1);
        }

        return res;
    }
}