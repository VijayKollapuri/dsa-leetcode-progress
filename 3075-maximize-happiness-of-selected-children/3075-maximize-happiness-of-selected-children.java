class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);

        int count = 0;
        Long maxHappi =  0L;
        int n = happiness.length - 1;
        while(count < k){
            if(happiness[n] - count <= 0) break;
            maxHappi += happiness[n] - count;
            count++;
            n--;
        }

        return maxHappi;
    }
}
        // int count = 0; 
        // Long maxHappi = 0L;

        // for(int i = happiness.length - 1; i >= 0 && count < k; i--){
        //     int cur = happiness[i] - count;
        //     if(cur <= 0) break;
        //     maxHappi += cur;
        //     count++;
        // }
        // return maxHappi;

//=======================================================
        // Arrays.sort(happiness);
        // int count = 0, n = happiness.length-1;
        // long maxHappi = 0L;
        // while(count < k){
        //     maxHappi += happiness[n];

        //     int i = n-1;
        //     while(i != -1){
        //         if(happiness[i] > 0)
        //         happiness[i] = happiness[i] - count;
        //         i--;
        //     }
        //     n--;
        //     count++;

        // }
        // return maxHappi;