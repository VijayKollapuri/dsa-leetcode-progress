
class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i = low; i <= high; i++) {
            String s = String.valueOf(i);
            int n = s.length();
            if((n == 1) || (n % 2) == 1) continue;

            int r = 0, l = 0;
            int mid = n / 2;
            for(int j = 0; j < mid; j++) {
                l += s.charAt(j) - '0';
            }

            for(int j = mid; j < n; j++) {
                r += s.charAt(j) - '0';
            }

            if(l == r) count++;
        }
        return count;
    }
}

//         int count = 0;
//         for(int i = low; i <= high; i++) {
//             String s = String.valueOf(i);
//             if(s.length() > 1 && ((s.length() % 2) == 0)) {
//                 int n = s.length()/2;
//                 String s1 = s.substring(0, n);
//                 String s2 = s.substring(n, (n+n));
//                 if(sum(s1) == sum(s2)){
//                      count++;
//                 System.out.println(s);
//             }
//             }
//         }
//         return count;
//     }

//     public static int sum(String s) {
//         int n = Integer.parseInt(s);
//         int res = 0;
//         while(n > 0) {
//             res += n % 10;
//             n /= 10;
//         }
//         return res;
//     }
// }