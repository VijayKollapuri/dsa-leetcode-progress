class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];

        return IntStream.range(0, s1.length())
                       .takeWhile(i -> s1.charAt(i) == s2.charAt(i))
                       .mapToObj(i -> String.valueOf(s1.charAt(i)))
                       .reduce("", (a, b) -> a + b);

        }
}