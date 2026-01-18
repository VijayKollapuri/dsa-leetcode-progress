class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       int max = nums.length;
       boolean[] arr = new boolean[max + 1];
        for(int i : nums) arr[i] = true;;
        List<Integer> res = new ArrayList<>();
        for(int i = 1; i < arr.length; i++){
            if(!arr[i])
            res.add(i);
        }
        return res;
        }
    }