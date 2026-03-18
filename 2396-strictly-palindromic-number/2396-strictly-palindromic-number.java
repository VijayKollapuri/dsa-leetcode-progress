class Solution {
    public boolean isStrictlyPalindromic(int n) {
        // String s = String.valueOf(n);

        // for(int i = 2; i <= n - 2; i++) {
        //     String 
        // }
        return false;
    }

    private static boolean isPalin(String s) {
        int n = s.length();
        return IntStream.range(0, s.length()/2)
                        .allMatch(i -> s.charAt(i) == s.charAt(n - i - 1));
    }
}