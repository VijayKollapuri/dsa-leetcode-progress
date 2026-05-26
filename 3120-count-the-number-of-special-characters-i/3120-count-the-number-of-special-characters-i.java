class Solution {
    public int numberOfSpecialChars(String word) {
        int[] up = new int[26];
        int[] low = new int[26];

        for(char c : word.toCharArray()) {
            if(c >= 'a' && c <= 'z') {
                low[c - 'a']++;
            } else {
                up[c - 'A']++;
            }
        }

        int count = 0;

        for(int i = 0; i < 26; i++) {
            if(up[i] != 0 && low[i] != 0) {
                    count++;
            }
        }

        return count;
    }
}