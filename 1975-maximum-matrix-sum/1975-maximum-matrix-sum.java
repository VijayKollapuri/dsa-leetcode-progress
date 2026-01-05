class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long maxSum = 0, minEle = Integer.MAX_VALUE, count = 0;
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j < matrix[i].length; j++) {
                maxSum += Math.abs(matrix[i][j]);
                if(Math.abs(matrix[i][j]) < minEle) {
                    minEle = Math.abs(matrix[i][j]);
                }
                    if(matrix[i][j] < 0) count++;
            }
        }
        if(count % 2 == 1) {
            // maxSum -= (minEle * 2);
            return maxSum - (minEle * 2);
        } else {   
            return maxSum;
        }
    }
}