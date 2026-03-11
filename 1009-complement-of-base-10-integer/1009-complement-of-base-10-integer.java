class Solution {
    public int bitwiseComplement(int n) {
        String res = Integer.toBinaryString(n);
        StringBuilder str = new StringBuilder();
        for(char c : res.toCharArray()) {
            if(c == '1') {
                str.append('0');
            } else {
                str.append('1');
            }
        }
        return Integer.parseInt(str.toString(), 2);
    }
}