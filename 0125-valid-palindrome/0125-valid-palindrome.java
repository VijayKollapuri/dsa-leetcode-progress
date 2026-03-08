class Solution {
    public boolean isPalindrome(String s) {
        String ss = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = ss.length();
        return IntStream.range(0, n)
                        .filter(i -> i <= n/2)
                        .allMatch(i -> ss.charAt(i) == ss.charAt(n - i - 1));
    }
}