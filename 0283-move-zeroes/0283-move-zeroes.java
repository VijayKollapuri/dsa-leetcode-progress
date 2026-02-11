class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i : nums) list.add(i);
          list =  list.stream()
		           .collect(Collectors.collectingAndThen(
				   Collectors.partitioningBy(i -> i == 0), map -> {
					   List<Integer> li = new ArrayList<>();
					   li.addAll(map.get(false));
					   li.addAll(map.get(true));
					   return li;
				   }));

        for(int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
    }
}