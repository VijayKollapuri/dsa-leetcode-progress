import java.util.stream.*;
class Solution {
    public int maxDistinct(String s) { 
    return Arrays.stream(s.split(""))
          .collect(Collectors.groupingBy(i -> i, Collectors.counting())).size();
    }
}