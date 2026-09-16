class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);

        for(int i : stones) {
            q.add(i);
        }

        int a = 0, b = 0;
        while(!q.isEmpty()) {
            if(q.size() >= 2) {
                a = q.poll();
                b = q.poll();
                if(a - b > 0) {
                    q.add(a - b);
                    a = 0; b = 0;
                } else {
                    a = 0; b = 0;
                }
            } else {
               return q.poll();
            }
        }

         return 0;

    }
}