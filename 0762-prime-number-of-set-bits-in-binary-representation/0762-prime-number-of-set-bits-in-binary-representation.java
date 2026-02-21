class Solution {
    public int countPrimeSetBits(int left, int right) {
        Set<Integer> set = Set.of(2, 3, 5, 7, 11, 13, 17, 19);
        int count = 0;
        for(int i = left; i <= right; i++) {
            int bitCount = setBits(i);
            if(set.contains(bitCount)) count++;
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
}