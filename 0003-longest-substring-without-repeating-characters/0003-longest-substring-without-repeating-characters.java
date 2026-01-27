class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
       int maxLen = Integer.MIN_VALUE;
       HashSet<Character> set = new HashSet<>();
       int i = 0;
       for(char ch : s.toCharArray()) {
            while(set.contains(ch)) {
                set.remove(s.charAt(i));
                i++;
            }
            set.add(ch);
            maxLen = set.size() > maxLen ? set.size() : maxLen;
       }
       return maxLen;
    
    }
}