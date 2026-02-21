class Solution {
    public int countPrimeSetBits(int left, int right) {
        Set<Integer> set = Set.of(2, 3, 5, 7, 11, 13, 17, 19);
        int count = 0;
        for(int i = left; i <= right; i++) {
            int bitCount = setBits(i);
            if(isPrime(bitCount)) count++;
        }
        return count;
    }

    public static int setBits(int n) {
        int count = 0;
        while(n > 0) {
            count += n % 2;
            n /= 2;
        }
        return count;
    }

    public static boolean isPrime(int n) {
        if(n == 0 || n == 1) return false;
        if(n == 2) return true;

        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}