class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums) {
            map.merge(i, 1, Integer::sum);
        }

 PriorityQueue<Integer> q = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));

        for(int i : map.keySet()) {
            q.add(i);
        }
        int res[] = new int[k];
        for(int i=0; i<k; i++) {
            res[i] = q.poll();
        }
        return res;
    }
}