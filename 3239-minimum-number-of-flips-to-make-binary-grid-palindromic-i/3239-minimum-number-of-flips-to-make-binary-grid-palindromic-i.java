class Solution {
    public int minFlips(int[][] grid) {
        int rCount = 0, cCount = 0;

        for(int i = 0; i < grid.length; i++) {
            int s = 0, e = grid[i].length-1;
            while(s < e) {
                if(grid[i][s] != grid[i][e]) {
                    rCount++;
                }
                s++;
                e--;
            }
        }

         for(int i = 0; i < grid[0].length; i++) {
            int s = 0, e = grid.length-1;
            while(s < e) {
                if(grid[s][i] != grid[e][i]) {
                    cCount++;
                }
                s++;
                e--;
            }
        }

       return Math.min(cCount, rCount);
    }
}