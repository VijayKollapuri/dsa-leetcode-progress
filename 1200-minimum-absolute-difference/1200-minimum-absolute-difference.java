class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        int minDif = Integer.MAX_VALUE;
        for(int i=1; i<arr.length; i++) {
            // minDif = Math.min(minDif, (arr[i] - arr[i-1]));
            int n = Math.abs((arr[i] - arr[i-1]));
            minDif =  n < minDif ? n : minDif;
        }

        for(int i=1; i<arr.length; i++) {
            int n = Math.abs((arr[i] - arr[i-1]));
            if(n == minDif) {
                list.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }
        return list;
    }
}