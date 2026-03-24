class Solution {

    private static HashMap<String, Character> map = new HashMap<>();
    static {
        map.put("&quot;", '"');
        map.put("&amp;", '&');
        map.put("&gt;", '>');
        map.put("&lt;", '<');
        map.put("&frasl;", '/');
    }
    private static String s2 = "&apos;";
    private static String c2 = "'";

    public String entityParser(String text) {
        StringBuilder str = new StringBuilder(text);
        int i = 0;
        while(i < str.length()) {
            if(str.charAt(i) == '&') {
                StringBuilder temp = new StringBuilder("&");
                int j = i + 1; 
                    while(j < str.length() && str.charAt(j) != ';') { 
                        temp.append(str.charAt(j));
                    j++;
                }
                
                temp.append(";");

                if(temp.toString().equals(s2)) str.replace(i, j+1, c2);
                else {
                    if(map.containsKey(temp.toString())){
                    str.replace(i, j + 1, map.get(temp.toString()) + "");
                }
                }
            }
            i++;
        }

        return str.toString();
    }
}