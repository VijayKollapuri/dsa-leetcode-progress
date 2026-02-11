class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0; 
        for(int j=0; j < nums.length; j++) {
            if(nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        // List<Integer> list = new ArrayList<>();
        // for(int i : nums) list.add(i);
        //   list =  list.stream()
		//            .collect(Collectors.collectingAndThen(
		// 		   Collectors.partitioningBy(i -> i == 0), map -> {
		// 			   List<Integer> li = new ArrayList<>();
		// 			   li.addAll(map.get(false));
		// 			   li.addAll(map.get(true));
		// 			   return li;
		// 		   }));

        // for(int i = 0; i < list.size(); i++) {
        //     nums[i] = list.get(i);
        // }
    }
}