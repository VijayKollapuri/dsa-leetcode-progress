class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> map = new HashMap<>();
       return IntStream.range(0, nums.length)
                .mapToObj(i -> {
                    int complement = target - nums[i];
                    if(map.containsKey(complement)) {
                        return new int[]{map.get(complement), i};
                    }
                    map.put(nums[i], i);
                    return null;
                })
                .filter(Objects::nonNull)
                .findFirst()
                .orElse(new int[]{-1, -1});
    //    return IntStream.range(0, nums.length)
    //             .boxed()
    //             .flatMap(i ->
    //                 IntStream.range(i + 1, nums.length)
    //                 .takeWhile(j -> nums[i] + nums[j] == target)
    //                 .mapToObj(j -> new int[]{i,j})
    //                 )
    //             .findFirst()
    //             .orElse(new int[]{-1,-1});

    }
}
/**

  return IntStream.range(0, nums.length)
                .boxed()
                .flatMap(i -> IntStream.range(i + 1, nums.length)
                        .filter(j -> nums[i] + nums[j] == target)
                        .mapToObj(j -> new int[]{i, j})
                )
                .findFirst()

 */