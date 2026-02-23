class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> set = new HashSet<>();
        int n = (1 << k);
        for(int i = 0; i <= s.length() - k; i++) {
            set.add(s.substring(i, k + i));
            if(set.size() == n) return true;
        }
        return false;

    }
}