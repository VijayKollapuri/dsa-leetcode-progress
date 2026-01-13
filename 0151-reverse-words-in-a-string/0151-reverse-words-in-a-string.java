class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        StringBuilder str = new StringBuilder();
        int i = s.length() - 1;
        int count = 0;
        while(i >= -1) {
            if(i == -1 || s.charAt(i) == ' ' ) {
                if(count == 0) {
                    res.append(str.reverse()).append(" ");
                }
                count++;
                i--;
                str.setLength(0);
            } else {
                str.append(s.charAt(i));
                count = 0;
                i--;
            }
        }
        return res.toString().trim();
    }
}