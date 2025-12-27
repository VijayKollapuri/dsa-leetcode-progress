class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> hs = new HashSet<>();

        while (n != 1){
            int num = 0;
            while (n != 0){
                int r = n % 10;
                num = (r*r) + num;
                n = n / 10;
            }
            n = num;
            if (hs.contains(n))
                return false;
            hs.add(n);
        }
        return n == 1;
    }
}