class Solution {
    public int countPrimeSetBits(int left, int right) {
        return IntStream.rangeClosed(left, right)
                        .map(Solution::setBits)
                        .filter(Solution::isPrime)
                        .reduce(0, (a, b) -> a + 1);
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