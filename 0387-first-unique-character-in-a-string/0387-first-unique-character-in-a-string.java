class Solution {
    public int firstUniqChar(String s) {
        Optional<Character> ch = 
        s.chars()
        .mapToObj(c -> (char) c)
        .filter(c -> s.indexOf(c) == s.lastIndexOf(c))
        .findFirst();

       if(ch.isPresent())
       return s.indexOf(ch.get());
        // int[] freq = new int[26];
        // for(char c : s.toCharArray()) {
        //     freq[c - 'a']++;
        // }

        // for(int i=0; i<s.length(); i++) {
        //     char c = s.charAt(i);
        //     if(freq[c-'a'] == 1) return i;
        // }
        // // LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        // // for(char c : s.toCharArray()) {
        // //     map.put(c, map.getOrDefault(c,0)+1);
        // // }

        // // for(char c : map.keySet()) {
        // //     if(map.get(c) == 1) {
        // //         return s.indexOf(c);
        // //     }
        // // }
   return -1;
    }
}