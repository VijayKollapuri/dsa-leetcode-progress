

class Solution {
    public String longestPalindrome(String s) {
        return IntStream.range(0, s.length())
                        .boxed()
                        .flatMap(i -> Stream.of(
                            find(s, i, i),
                            find(s, i, i+1)
                        ))
                        .max(Comparator.comparingInt(String::length)).orElse("");
    }

    public String find(String s, int l, int r) {
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }
}


/*
class Solution {
    public String longestPalindrome(String s) {
         List<String> list = IntStream.range(0, s.length())
                        .boxed()
                        .flatMap(i -> IntStream.rangeClosed(i+1, s.length())
                                            .mapToObj(j -> s.substring(i,j)))
                        .collect(Collectors.toCollection(LinkedList::new));

           return list.stream().filter(Solution::isPalindrome)
                        .max(Comparator.comparingInt(String::length)).orElse("");
       
    }

    public static boolean isPalindrome(String s) {
        return IntStream.range(0, s.length()/2)
                        .allMatch(i -> s.charAt(i) == s.charAt(s.length() - i - 1));
    }
}
*/