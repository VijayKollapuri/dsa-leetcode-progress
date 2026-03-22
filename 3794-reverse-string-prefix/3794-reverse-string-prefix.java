class Solution {
    public String reversePrefix(String s, int k) {
        if(k == 1) return s;
        if(s.length() == k) return new StringBuilder(s).reverse().toString();

        return 
        new StringBuilder(s.substring(0, k)).reverse().append(s.substring(k, s.length())).toString();


    }
}