class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
       TreeSet<Integer> set = new TreeSet<>();

       for(int i : nums) set.add(i);

       ArrayList<Integer> list = new ArrayList<>(set);
       int count = 1;
       int temp = 1;
       int prev = list.get(0);
       for(int i = 1; i < list.size(); i++) {
            if(list.get(i) - prev == 1) {
                temp++;
                prev = list.get(i);
            } else {
                prev = list.get(i);
                temp = 1;
            }

            count = Math.max(temp, count);
       }
        return count;

    }
}