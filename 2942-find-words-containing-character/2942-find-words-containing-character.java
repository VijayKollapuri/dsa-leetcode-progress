class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
       List<Integer> list = new ArrayList<>();
       for(int i = 0; i < words.length; i++) {
        if(words[i].contains(x+"")) list.add(i);
       }
       return list;

    //    int[] n = {0};
    //    return Arrays.stream(words)
    //          .map(i -> {
    //             if(i.contains(x+"")) return n[0];
    //             else {
    //                 return -1;
    //             }
    //          })
    //          .filter(i ->{ n[0]++; return i != -1; })
    //          .toList();
    }
}