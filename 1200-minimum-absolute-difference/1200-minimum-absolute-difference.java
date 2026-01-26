class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        int minDif = Integer.MAX_VALUE;
        for(int i=1; i<arr.length; i++) {
            minDif = Math.min(minDif, (arr[i] - arr[i-1]));
        }

        System.out.println(minDif);
        for(int i=1; i<arr.length; i++) {
            if((arr[i] - arr[i-1]) == minDif) {
                list.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }
        return list;
    }
}