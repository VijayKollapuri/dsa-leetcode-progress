class Solution {
    public int numIdenticalPairs(int[] nums) {
        if(nums.length < 1) return 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        for(int n : map.values()){
            count += n * (n - 1);
        }

        return count/2;
    }
}
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //             if(nums[i] == nums[j]) count++;
        //     }
        // }