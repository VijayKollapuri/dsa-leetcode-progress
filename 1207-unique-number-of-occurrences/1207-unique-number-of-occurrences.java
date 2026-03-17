class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashSet<Long> hs = new HashSet<>();
       return Arrays.stream(arr)
              .boxed()
              .collect(Collectors.groupingBy(i->i, Collectors.counting()))
              .entrySet()
              .stream()
              .map(Map.Entry::getValue)
              .allMatch(i -> hs.add(i));

    }
}