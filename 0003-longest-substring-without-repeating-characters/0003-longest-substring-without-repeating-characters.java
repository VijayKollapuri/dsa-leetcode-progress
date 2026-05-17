class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, max = 0, start = 0;

        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            while(set.contains(c)) {
                set.remove(s.charAt(left++));
            }

            set.add(c);

            if(i - left + 1 > max) {
                max = i - left + 1;
                start = left;
            }
        }

        System.out.println(s.substring(start, max + start));

        return max;
    }
}