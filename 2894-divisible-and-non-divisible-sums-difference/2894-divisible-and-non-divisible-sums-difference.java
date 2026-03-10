class Solution {
    public int differenceOfSums(int n, int m) {
        int num1 = 0, num2 = 0;
        for(int i = 1; i <= n; i++) {
            if (i % m == 0) {
                num1 += i;   // sum of multiples of m
            } else {
                num2 += i;   // sum of NON-multiples of m
            }
        }
        return num2 - num1;
    }
}