class Solution {
    public static int sumFourDivisors(int[] nums) {
        int res = 0;
        for(int i : nums) {
        	res += helper(i);
        }
        return res;
    }

    public static int helper(int n) {
    	int count = 0;
    	int sum = 0;
          for(int j = 1; j <= Math.sqrt(n); j++) {
            int d1 = j;
            int d2 = j / n;

                if(n % j == 0) {
                    if((j == (n/j)) && ((j * (n/j)) == n)) {
                        count++;
                        sum += j;
                    } else {
                        count += 2;
                        sum += j;
                        sum += n / j;
                    }
                }
          }
          return (count == 4) ? sum : 0;
    }
}