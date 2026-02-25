class Solution {
    public String frequencySort(String s) {
        return 
        Stream.of(s.split(""))
              .collect(Collectors.groupingBy(i->i, Collectors.counting()))
              .entrySet()
              .stream()
              .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder())
                        .thenComparing(Map.Entry.comparingByKey()))    
              .map(e -> e.getKey().repeat(e.getValue().intValue()))
              .collect(Collectors.joining());

    }
}

/*
flatMap(e -> LongStream.range(0, e.getValue())
                                     .takeWhile(i -> i < e.getValue())
                                     .mapToObj(i -> e.getKey())
                                     .collect(Collectors.joining())
                                     ).reduce("", (a, b) -> a + b);
*/