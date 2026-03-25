class Solution {
    public String customSortString(String order, String s) {
        Map<Character, Long> map = 
                                s.chars()
                                  .mapToObj(i -> (char) i)
                                  .collect(Collectors.groupingBy(i->i, Collectors.counting()));

                StringBuilder str = new StringBuilder();

                for(char c : order.toCharArray()) {
                    if(map.containsKey(c)) {
                        long n = map.get(c);
                        while(n-- > 0) {
                            str.append(c);
                        }
                        map.put(c, n);
                    }
                }

                for(Map.Entry<Character, Long> e : map.entrySet()) {
                    if(e.getValue() > 0) {
                        char c = e.getKey();
                        long n = e.getValue();
                        while(n-- > 0) {
                            str.append(c);
                        }
                    }
                }

                return str.toString();
    }
}