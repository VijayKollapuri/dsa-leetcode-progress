class Solution {
    public char findTheDifference(String s, String t) {
        char res = 0;
        for(char c : t.toCharArray()) {
            res ^= c;
        }
        for(char c : s.toCharArray()) {
            res ^= c;
        }
        return res;
        // int[] freq = new int[26];
        // for(int i = 0; i<s.length(); i++) {
        //     freq[s.charAt(i) - 'a']++;
        // }

        // for(int i = 0; i<t.length(); i++) {
        //     freq[t.charAt(i) - 'a']--;
        // }

        // for(int i = 0; i < 26; i++) {
        //     if(freq[i] != 0) {
        //         return (char) (i + 'a');
        //     }
        // }
        // return ' ';
    }
}