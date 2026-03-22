class Solution {
    public String sortSentence(String s) {
       return
            Stream.of(s.split(" "))
                .collect(Collectors.groupingBy(i -> i.charAt(i.length() - 1)))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Character, List<String>>comparingByKey())
                .map(i -> i.getValue().get(0))
                .map(i -> i.substring(0, i.length() - 1))
                .collect(Collectors.joining(" "));
               
              
    }
}