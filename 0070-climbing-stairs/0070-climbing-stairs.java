class Solution {
    public int climbStairs(int n) {

        if (n == 1 || n == 2){
            return n;
        }
        int ar[] = new int [46];
        
        int x = 1;
        int y = 2;
        int res = 0;

        for (int i=3;i<=n;i++){
            res = x + y;
            x = y;
            y = res;
        }
       return res;
    } 
}