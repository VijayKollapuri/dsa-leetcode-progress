class Solution {
    public int[][] merge(int[][] arr) {
        List<int[]> list = new ArrayList<>();
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        int cur[] = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i][0] <= cur[1]) {
                cur[1] = Math.max(arr[i][1], cur[1]);
            } else  {
                list.add(cur);
                cur = arr[i];
            }
        }
        list.add(cur);
        return list.toArray(new int[0][]);
    }
}