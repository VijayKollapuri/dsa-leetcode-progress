class Solution {
    public int binaryGap(int s) {
        char[] ch = Integer.toBinaryString(s).toCharArray();
        int n  = ch.length;
        int max = 0;
        for(int i = 0; i < n; i++) {
            if(ch[i] == '1') {
                int j = i + 1; 
                while(j < n && ch[j] != '1') {
                    j++;
                }
                
            if (j == n) continue;

                max = Math.max(max, j - i);

            }
        }
        return max;
    }
}