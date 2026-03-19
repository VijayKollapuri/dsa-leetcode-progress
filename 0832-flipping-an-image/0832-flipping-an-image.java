class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] res = new int[image.length][image[0].length];

        for(int i = 0; i < image.length; i++) {
            int[] temp = image[i];

            int j = 0, k = temp.length - 1;
            int l = 0;
            while(k >= j) {
                res[i][l] = temp[k] == 0 ? 1 : 0;
                k--;
                l++;
            }
        }

        return res;
    }
}