class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
       TreeSet<Integer> set = new TreeSet<>();

       for(int i : nums) set.add(i);

    //    ArrayList<Integer> list = new ArrayList<>(set);
    //    int prev = list.get(0);
    //    for(int i = 1; i < list.size(); i++) {
    //         if(list.get(i) - prev == 1) {
    //             temp++;
    //             prev = list.get(i);
    //         } else {
    //             prev = list.get(i);
    //             temp = 1;
    //         }

    //         count = Math.max(temp, count);
    //    }

    int count = 0, prev = 0, temp = 0;
    for(int i : set) {
        if(i - prev == 1) {
            temp++;
            prev = i;
        } else {
            prev = i;
            temp = 1;
        }

        count = Math.max(count, temp);
    }



        return count;

    }
}