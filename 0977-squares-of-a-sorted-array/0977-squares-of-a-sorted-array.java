class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        if(n == 1) return new int[]{nums[0] * nums[0]};
        int[] res = new int[n];
        int i = 0,  j = 0;
        for(int k=n-1; k >= 0; k--){
            if(nums[k] < 0) {
                j = k;
                break;
            }
        }
        i = j + 1;
        int idx = 0;
        while(j >= 0 && i < n) {
            int s1 = nums[i]*nums[i];
            int s2 = nums[j]*nums[j];
             if(s1 < s2) {
                res[idx++] = s1;
                i++;
            } else {
                res[idx++] = s2;
                j--;
            }
        }

        while(i < n ) {
            int s1 = nums[i] * nums[i];
            res[idx++] = s1;
            i++;
        }

        while(j >= 0) {
            int s1 = nums[j] * nums[j];
            res[idx++] = s1;
            j--;
        }
        return res;
    }
}

//   p1      p2
// -7 -3 2 3 11 
// 49  9 4 9 121

// 4 9  9  49 121