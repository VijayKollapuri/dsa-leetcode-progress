class Solution {
    public int[] vowelStrings(String[] w, int[][] q) {
        int[] res = new int[w.length];
        res[0] = isPalin(w[0]) ? 1 : 0;

        for(int i = 1; i < w.length; i++) {
            res[i] = res[i - 1] + (isPalin(w[i]) ? 1 : 0);
        }

        int result[] = new int[q.length];
        for(int i = 0; i <   q.length; i++) {
            int j = q[i][0];
            int k = q[i][1];

            if(j == 0) result[i] = res[k];
            else {
                result[i] = res[k] - res[j - 1];
            }
        }
        return result;
        //     int count = 0;
        //     while(j <= k) {
        //         if(isPalin(w[j])) count++;
        //         j++;
        //     }

        //     res[i] = count;
        // }
        // return res;
    }

    private static boolean isPalin(String s) {
        char f = s.charAt(0);
        char l = s.charAt(s.length() - 1);
        return ("aeiou".indexOf(f) > -1 && "aeiou".indexOf(l) > -1);
    }
}