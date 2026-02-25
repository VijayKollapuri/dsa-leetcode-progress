class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0 || s == null) return false;
        // String org = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        // String rev = new StringBuilder(org).reverse().toString();
        // return org.equals(rev);
    String og = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
    int n = og.length();
    return IntStream.range(0, og.length()/2)
                    .allMatch(i -> og.charAt(i) == og.charAt(n - i - 1));


    }
}