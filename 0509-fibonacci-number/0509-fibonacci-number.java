class Solution {
    public int fib(int n) {
        int i = 1, j = 1, res = 0;
        if(n == 0 || n == 1) return n;
        if(n == 2) return 1;
         
        for(int z=3; z <= n; z++) {
            res = j + i;    
            j = i;
            i = res;
        }
        return res;
    }
}