class Solution {
    public int[] recoverOrder(int[] o, int[] f) {
       HashSet<Integer> set = new HashSet<>(f.length);
       for(int i : f) {
        set.add(i);
       }

       int res[] = new int[f.length];
       int j = 0;
       for(int i : o) {
        if(set.contains(i)){
           res[j++] = i;
           //set.remove(i);
        }
       }

       return res;
    }
}