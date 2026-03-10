class Solution {
    public int scoreOfString(String s) {
    int sum = 0;
    int prev = s.charAt(0);
    for(int i = 1; i < s.length(); i++) {
        int cur = s.charAt(i);
        sum += Math.abs(prev - cur);
        prev = cur;
    }
    return sum;
    }
}