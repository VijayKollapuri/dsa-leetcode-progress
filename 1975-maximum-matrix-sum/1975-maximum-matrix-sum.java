class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long res = 0;
        int minEle = Integer.MAX_VALUE, count = 0;

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                int num = Math.abs(matrix[i][j]);
                res += num;
                minEle = Math.min(minEle, num);
                if(matrix[i][j] < 0) count++;
            }
        }

        if(count % 2 == 1) {
            return res - (minEle * 2);
        }

        return res;
    }
}