class Solution {
    public int numJewelsInStones(String j, String s) {
        int count = 0;
        for(char c : s.toCharArray()) {
            if(j.indexOf(c) > -1) count++;
        }

        return count;
    }
}