import java.util.stream.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int ar[] = new int [2];
        HashMap<Integer,Integer> hs = new HashMap<>();
        int n = nums.length;

        IntStream.range(0,n)
        .boxed()
        .filter(idx -> {
            int val = target - nums[idx];
            if (hs.containsKey(val)){
                ar[0] = idx;
                ar[1] = hs.get(val);
            }
            hs.put(nums[idx],idx);
            return hs.containsKey(val);
        }).toList();

        System.out.println(hs);
        return ar;
    }
}
    