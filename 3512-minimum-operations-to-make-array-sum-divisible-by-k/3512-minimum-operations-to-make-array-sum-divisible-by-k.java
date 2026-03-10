class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = Arrays.stream(nums)
                        .sum();
        
        // int count = 0;
        // while(!((sum % k) == 0)) {
        //     sum--;
        //     count++;
        // }
        return sum % k;
    }
}