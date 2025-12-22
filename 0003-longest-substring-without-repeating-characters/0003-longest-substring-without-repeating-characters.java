class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) return 0;
        int maxLen = Integer.MIN_VALUE;
        for(int i=0; i<s.length(); i++){
            StringBuilder str = new StringBuilder();
            for(int j=i; j<s.length(); j++){
                char ch = s.charAt(j);
                if(!str.toString().contains(ch+"")){
                    str.append(ch);
                } else break;
            }
            maxLen = str.length() > maxLen ? str.length() : maxLen;
        }
        return maxLen;
    }
}