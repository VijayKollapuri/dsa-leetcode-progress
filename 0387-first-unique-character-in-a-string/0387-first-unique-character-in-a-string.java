class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(char c : map.keySet()) {
            if(map.get(c) == 1) {
                return s.indexOf(c);
            }
        }
   return -1;
    }
}