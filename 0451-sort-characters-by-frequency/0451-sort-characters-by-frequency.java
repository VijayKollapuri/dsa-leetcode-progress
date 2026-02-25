class Solution {
    public String frequencySort(String s) {
        // return 
        // Stream.of(s.split(""))
        //       .collect(Collectors.groupingBy(i->i, Collectors.counting()))
        //       .entrySet()
        //       .stream()
        //       .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder())
        //                 .thenComparing(Map.Entry.comparingByKey()))    
        //       .map(e -> e.getKey().repeat(e.getValue().intValue()))
        //       .collect(Collectors.joining());

        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        PriorityQueue<Map.Entry<Character, Integer>> q = new PriorityQueue<>((a, b) -> Integer.compare(b.getValue(), a.getValue()));
        q.addAll(map.entrySet());
        StringBuilder str = new StringBuilder();
        while(!q.isEmpty()) {
            Map.Entry<Character, Integer> m = q.poll();
            str.append(String.valueOf(m.getKey()).repeat(m.getValue()));
        }
        return str.toString();


    }
}
