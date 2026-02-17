class Solution {
    public int[] productExceptSelf(int[] nums) {
        //=============================================================
        int[] res = new int[nums.length];         
        int[] pointer = {1};
        IntStream.range(0, nums.length)
                 .forEach(i -> {
                    res[i] = pointer[0];
                    pointer[0] *= nums[i];
                 });

        pointer[0] = 1;
        IntStream.range(0, nums.length)
                 .forEach(i -> {
                    int j = nums.length - 1 - i;
                    res[j] *= pointer[0];
                    pointer[0] *= nums[j];
                 });
        //========================================================
        // for(int i = 0; i < nums.length; i++) {
        //     res[i] = pointer;
        //     pointer *= nums[i];
        // }
        // pointer = 1;
        // for(int i = nums.length - 1; i >= 0; i--) {
        //     res[i] *= pointer;
        //     pointer *= nums[i];
        // }
        return res;
    }
}

/**
 int n = nums.length;
        int[] res = new int[n];

        int[] leftPointer = {1};
        IntStream.range(0, n).forEach(i -> {
            res[i] = leftPointer[0];
            leftPointer[0] *= nums[i];
        });

        int[] rightPointer = {1};
        IntStream.range(0, n).forEach(i -> {
            int j = n - 1 - i;
            res[j] *= rightPointer[0];
            rightPointer[0] *= nums[j];
        });
 */