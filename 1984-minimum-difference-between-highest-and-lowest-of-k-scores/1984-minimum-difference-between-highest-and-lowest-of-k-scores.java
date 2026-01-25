class Solution {
    public int minimumDifference(int[] nums, int k) {

        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        int minAns = (int) 10e7;
        Arrays.sort(nums);

        for (int i=0;i<k;i++){
            min.add(nums[i]);
            max.add(nums[i]);
        }

        minAns = Math.min(minAns,max.peek() - min.peek());
    

        for (int i=k;i<nums.length;i++){
            min.poll();
            max.poll();

            min.add(nums[i]);
            max.add(nums[i]);

            minAns = Math.min(minAns,max.peek() - min.peek());
            System.out.println(max.peek() - min.peek());

        }
        return minAns;
    }
}


