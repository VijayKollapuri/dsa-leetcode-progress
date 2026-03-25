class Solution {
    public String customSortString(String order, String s) {
        // Map<Character, Long> map = 
        //                         s.chars()
        //                           .mapToObj(i -> (char) i)
        //                           .collect(Collectors.groupingBy(i->i, Collectors.counting()));

        //         StringBuilder str = new StringBuilder();

        //         for(char c : order.toCharArray()) {
        //             if(map.containsKey(c)) {
        //                 long n = map.get(c);
        //                 while(n-- > 0) {
        //                     str.append(c);
        //                 }
        //                 map.put(c, n);
        //             }
        //         }

        //         for(Map.Entry<Character, Long> e : map.entrySet()) {
        //             if(e.getValue() > 0) {
        //                 char c = e.getKey();
        //                 long n = e.getValue();
        //                 while(n-- > 0) {
        //                     str.append(c);
        //                 }
        //             }
        //         }

        //         return str.toString();

        int[] f = new int[26];
        for(char c : s.toCharArray()) f[c - 'a']++;

        StringBuilder str = new StringBuilder();

        for(char c : order.toCharArray()) {
            if(f[c - 'a'] > 0) {
                int n = c - 'a';
                while(f[n]-- > 0) {
                    str.append(c);
                }
            }
        }

        for(int i = 0; i < 26; i++) {
            if(f[i] > 0) {
                while(f[i]-- > 0) {
                    str.append((char) (i + 'a'));
                }
            }
        }

        return str.toString();
    }
}