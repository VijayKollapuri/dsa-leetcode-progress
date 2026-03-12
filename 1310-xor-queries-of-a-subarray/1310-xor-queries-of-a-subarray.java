class Solution {
    public int[] xorQueries(int[] arr, int[][] q) {
        int[] res = new int[q.length];
        int x = 0;
        for(int i = 0; i < q.length; i++) {
            int temp = 0;
            int row = q[i][0];
            int col = q[i][1];
            for(int j=row; j<=col; j++) {
               temp ^= arr[j];
            }
            res[i] = temp;
        }
        return res;
    }
}