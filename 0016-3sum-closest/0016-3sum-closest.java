class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int s = nums[0] + nums[1] + nums[n-1];
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(target, s);
        for(int i=0; i<nums.length-1; i++) {
            int left = i + 1, right = n-1;
            while(left < right) {
            int sum = nums[i] + nums[left] + nums[right];
            int dif = Math.abs(target - sum);
            int mapVal = Math.abs(target - map.get(target));
            if(dif <= mapVal) {
                map.put(target, sum);
                // left++;
                // right--;
            } 
            
             if(sum > target) {
                right--;
            } else
                left++;
            }
        }
        return map.get(target);
    }
}



// -4 -1 1 2

