class Solution {
    public int maxProduct(String[] words) {
        int max = 0;
        for(int i = 0; i < words.length-1; i++) {
            for(int j = i+1; j < words.length; j++) {
                if(!helper(words[i], words[j])) {
                    int n = words[i].length(), m = words[j].length();
                    max = Math.max(max, (n*m));
                }
            }
        }
        return max;
    }

 
   
    // Returns true if s1 and s2 share at least one common character
    public static boolean helper(String s1, String s2) {
        boolean[] seen = new boolean[26];
        for (int i = 0; i < s1.length(); i++) {
            seen[s1.charAt(i) - 'a'] = true;
        }
        for (int i = 0; i < s2.length(); i++) {
            if (seen[s2.charAt(i) - 'a']) return true; // common letter found
        }
        return false; // disjoint

    }

}