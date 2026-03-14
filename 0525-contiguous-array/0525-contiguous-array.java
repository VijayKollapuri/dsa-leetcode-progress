class Solution {
    public int findMaxLength(int[] nums) {
       
        int max = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(sum, -1);
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) sum++;
            else sum--;

             if(map.containsKey(sum)) 
                    max = Math.max(max, i - map.get(sum));
              else map.put(sum, i);
        }
        return max;
    }
}