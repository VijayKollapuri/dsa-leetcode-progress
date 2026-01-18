class Solution {
        public static final String val1 = "qwertyuiop";
        public static final String val2 = "asdfghjkl";
        public static final String val3 = "zxcvbnm";
    public String[] findWords(String[] str) {
         if(str == null || str.length == 0) {
                return str;
            }
        ArrayList<String> list = new ArrayList<>();
        for(String s : str) {
            if(s == null || s.length() == 0) {
                continue;
            }
            if(helper(s, val1) || helper(s, val2) || helper(s, val3)) {
                list.add(s);
            }
        }
        String res[] = new String[list.size()];
        int i = 0;
        for(String s : list) {
            res[i++] = s;
        }
        return res;
    }

    public static boolean helper(String str, String val) {           
            for(char ch : str.toCharArray()) {
                if(val.indexOf(Character.toLowerCase(ch)) < 0) {
                    return false;
                }
            }
            return true;
    }
}