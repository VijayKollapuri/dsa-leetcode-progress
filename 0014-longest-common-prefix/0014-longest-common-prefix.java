class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        int minLen = Integer.MAX_VALUE;
        for(String s : strs){
            if(s.length() < minLen) minLen = s.length();
        }

        int ed = minLen;

        for(int i=0; i<minLen; i++) {
            for(int j = 1; j < strs.length; j++) {
                if(strs[0].charAt(i) != strs[j].charAt(i)) {
                    return strs[0].substring(0,i); 
                }
            }
        }

        return strs[0].substring(0, ed);

    }
}