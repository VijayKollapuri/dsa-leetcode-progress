class Solution {
    public int lengthOfLongestSubstring(String s) {
    HashMap<Character, Integer> map = new HashMap<>();
    int maxLen = 0, j = 0, n = s.length();
    for(int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if(map.containsKey(c)) {
            j = Math.max(j, map.get(c) + 1);
        }
        maxLen = Math.max(maxLen, i - j  + 1);
        map.put(c, i);
     }
     return maxLen;
    }
}