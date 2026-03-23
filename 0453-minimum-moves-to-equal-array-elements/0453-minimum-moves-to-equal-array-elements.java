class Solution {
    public int minMoves(int[] nums) {
        // int min = Arrays.stream(nums).min().orElse(0);
        // int sum = Arrays.stream(nums).sum();
        // return sum - nums.length * min;
        int min = Integer.MAX_VALUE;
        int moves = 0;
        for (int n : nums) {
            min = Math.min(min, n);
        }
        for (int n : nums) {
            moves += n - min;
        }
        return moves;
    }
}