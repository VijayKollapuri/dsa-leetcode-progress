
class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int r = 0, c = n - 1;
        int count = 0;

        while (r < m && c >= 0) {
            if (grid[r][c] < 0) {
                count += (m - r);
                c--; 
            } else {
                r++; // move down to rows with smaller values
            }
        }
        return count;
    }
}
``


// class Solution {
//     public int countNegatives(int[][] grid) {
//         int i = 0;
//         int j = grid[0].length - 1;
//         int ans = 0;

//         while (i < grid.length && j >= 0){
//             if (grid[i][j] < 0){
//                 j--;
//                 continue;
//             }
//             else 
//                 i++;
//             ans += (grid[0].length - j - 1);
//             System.out.println(i+ " "+j);
//         }
//         ans += (grid.length - i) * grid[0].length;
//         return ans ;
//     }
// }

// class Solution {
//     public int countNegatives(int[][] grid) {
//         int count = 0;
//         for(int i=0; i < grid.length; i++){
//             int left = 0, right = grid[i].length - 1;
//             while(left <= right) {
//                 int mid = left + (right - left)/2;
//                 if(grid[i][mid] < 0) {
//                     right = mid - 1;
//                 } else {
//                     left = mid + 1;
//                 }
//             }
//             count += grid[i].length - left;
//         }
//         return count;
//     }
// }
        // for(int i=0; i<grid.length; i++) {
        //     for(int j=0; j<grid[i].length; j++){
        //         if(grid[i][j] < 0) count++;
        //     }
        // }
        // return count;