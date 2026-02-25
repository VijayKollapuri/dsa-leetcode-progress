class Solution {
    public int[] sortByBits(int[] arr) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> {
            if(a[0] != b[0]) return Integer.compare(a[0], b[0]);
            else return Integer.compare(a[1], b[1]);
        });

        for(int i : arr) {
            q.offer(new int[]{Integer.bitCount(i), i});
        }

       int i = 0;
       while(!q.isEmpty()) {
        arr[i++] = q.poll()[1];
       }
       return arr;
    //    return Arrays.stream(arr)
    //                 .boxed()
    //                 .sorted(Comparator.comparingInt(Integer::bitCount).thenComparing(i -> i))
    //                 .mapToInt(Integer::intValue)
    //                 .toArray();
        
    }
}