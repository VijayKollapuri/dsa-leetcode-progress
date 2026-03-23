class Solution {
    public int minMoves(int[] nums) {
        int min = Arrays.stream(nums).min().orElse(0);
        int sum = Arrays.stream(nums).sum();
        return sum - nums.length * min;

    }
}