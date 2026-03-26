class Solution {
    public List<Integer> filterRestaurants(int[][] r, int vf, int mp, int md) {
            Comparator<int[]> cmp = (a, b) -> {
                if(a[1] != b[1]) return b[1] - a[1];
                else return b[0] - a[0];
            };

                if(vf == 1) return ifVegan(r, mp, md, cmp);
                else return notVegan(r, mp, md, cmp);
    }

    private static List<Integer> ifVegan(int[][] r, int mp, int md, Comparator<int[]> cmp) {
         return Arrays.stream(r)
                          .filter(i -> i[2] == 1 && i[3] <= mp && i[4] <= md)
                          .sorted(cmp)
                          .map(j -> j[0])
                          .toList();
    }

    private static List<Integer> notVegan(int[][] r, int mp, int md, Comparator<int[]> cmp) {
         return Arrays.stream(r)
                          .filter(i -> (i[3] <= mp && i[4] <= md))
                          .sorted(cmp)
                          .map(j -> j[0])
                          .toList();
    }
}