class Solution {
    public boolean isHappy(int n) {

        while (n >= 9){
            int num = 0;
            while (n != 0){
                int r = n % 10;
                num = (r*r) + num;
                n = n / 10;
            }
            n = num;
        }
        return n == 1 || n == 7;
    }
}