class Solution {
    public int strStr(String haystack, String needle) {
        int min = needle.length();
        for(int i = 0; i <= haystack.length()-min; i++) {
            String s = haystack.substring(i, i + min);
            if (needle.equals(s)) {
                return i;
            }
        }
        return -1;
    }
}