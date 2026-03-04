class Solution {
    public int lengthOfLongestSubstring(String s) {
    // HashMap<Character, Integer> map = new HashMap<>();
    // int maxLen = 0, j = 0, n = s.length();
    // for(int i = 0; i < s.length(); i++) {
    //     char c = s.charAt(i);
    //     if(map.containsKey(c)) {
    //         j = Math.max(j, map.get(c) + 1);
    //     }
    //     maxLen = Math.max(maxLen, i - j  + 1);
    //     map.put(c, i);
    //  }
    //  return maxLen;

    int[] j = {0}, maxLen = {0};
    HashMap<Character, Integer> map = new HashMap<>();
    IntStream.range(0, s.length())
            .forEach(i -> {
                char c = s.charAt(i);
                if(map.containsKey(c)) {
                    j[0] = Math.max(j[0], map.get(c) + 1);
                }
                maxLen[0] = Math.max(maxLen[0], i - j[0] + 1);
                map.put(c, i);
            });
            return maxLen[0];
    }
}