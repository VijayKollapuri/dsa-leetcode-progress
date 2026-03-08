class Solution {
    public boolean isPalindrome(String s) {
        String ss = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = ss.length();
       /* return IntStream.range(0, n)
                        .filter(i -> i <= n/2)
                        .allMatch(i -> ss.charAt(i) == ss.charAt(n - i - 1));
                     */
          return isPalin(ss,0, n-1);              
    }

    private static boolean isPalin(String s, int i, int j) {
        while(i <= j) {
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}