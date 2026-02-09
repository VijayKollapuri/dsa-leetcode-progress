class Solution {
    public int sumBase(int n, int k) {
        return digitSum(convert(n, k));
    }

    public static int convert(int n, int k) {
        StringBuilder str = new StringBuilder();
        while(n > 0) {
            str.append(n % k);
            n /= k;
        }

        return Integer.parseInt(str.toString());
    }

    public static int digitSum(int n) {
       return String.valueOf(n)
                    .chars()
                    .map(Character::getNumericValue)
                    .sum();
    }
}