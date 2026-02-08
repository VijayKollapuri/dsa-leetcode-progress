class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int n = arr.length;
        ArrayDeque<Integer> q = new ArrayDeque<>();
        // q.offer(0);
        int[] res = new int[n];
        for(int i = 0; i < n; i++) {
            while(!q.isEmpty() && arr[i] > arr[q.peek()]) {
                int idx = q.pop();
                res[idx] = i - idx;
            }
            q.push(i);
        }
        return res;
    }
}