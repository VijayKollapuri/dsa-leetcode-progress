class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<numbers.length; i++) {
            map.put(numbers[i], i + 1);
        }

        for(int i=0; i<numbers.length; i++){
            int complement = target - numbers[i];
            if(map.containsKey(complement)) {
                return new int[]{i+1, map.get(complement)};
            }
        }
        return new int[]{-1,-1};
    }
}


        // int left = 0, right = numbers.length-1;
        // while(left < right) {
        //     int sum = numbers[left] + numbers[right];
        //     if(sum == target) {
        //         return new int[]{left+1, right+1};
        //     } else if(sum > target) right--;
        //     else left++;
        // }