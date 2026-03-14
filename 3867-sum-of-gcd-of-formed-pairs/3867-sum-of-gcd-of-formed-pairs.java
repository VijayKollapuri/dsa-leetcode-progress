class Solution {
    public long gcdSum(int[] nums) {
        int pre[] = new int[nums.length];
        pre[0] = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i++) {
            max = nums[i] > max ? nums[i] : max;
            pre[i] = gcd(nums[i], max);
        }

        Arrays.sort(pre);
        long res = 0;
        int i = 0, j = pre.length - 1;
        while(i < j) {
            res += gcd(pre[i++], pre[j--]);
        }
        return res;
    }

    private static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}