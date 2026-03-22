class Solution {
    public String defangIPaddr(String s) {
        StringBuilder res = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(c == '.') {
                res.append("[");
                res.append(".");
                res.append("]");
            } else {
                res.append(c);
            }
        }

        return res.toString();
    }
}