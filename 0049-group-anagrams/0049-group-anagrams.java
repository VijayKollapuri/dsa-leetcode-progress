class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> maps = Arrays.stream(strs)
                                        .collect(Collectors.groupingBy(input -> {
                                            char ch[] = input.toCharArray();
                                            Arrays.sort(ch);
                                            return new String(ch);
                                        }));

        List<List<String>> list = new ArrayList<>();
        for(Map.Entry<String, List<String>> map : maps.entrySet()) {
            list.add(new ArrayList(map.getValue()));
        }
        return list;
    }
}
























//         List<List<String>> list = new ArrayList<>();
//     //     HashMap<String, List<String>> map = new HashMap<>();
//     //     for(String s : strs){
//     //         char ch[] = s.toCharArray();
//     //         Arrays.sort(ch);
//     //         String s1 = new String(ch);
//     //         map.putIfAbsent(s1, new ArrayList<String>());
//     //         map.get(s1).add(s);
//     //     }

//     //    for(List<String> str : map.values()) list.add(str);
       
//     //    return list;

//     Map<String,List<String>> map = Arrays.stream(strs)
//     .collect(Collectors.groupingBy( s -> {
//         char ch[] = s.toCharArray();
//         Arrays.sort(ch);
//         return new String(ch);
//         // int[] count = new int[26];
//         // for (char c : s.toCharArray()) {
//         // count[c - 'a']++;
        
// // return Arrays.toString(count);
// }));

//     list.addAll(map.values());
//     return list;

//     }
// }