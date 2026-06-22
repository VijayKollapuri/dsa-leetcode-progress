class Solution {
    public int maxNumberOfBalloons(String text) {
        int a =0, b = 0, l = 0, o = 0, n = 0;
        for(char c : text.toCharArray()) {
            switch(c) {
                case 'a' -> a++;
                case 'b' -> b++;
                case 'l' -> l++;
                case 'o' -> o++;
                case 'n' -> n++;
            }
        }
        // System.out.println(a + " " + b + " " + l + " " + o + " " + n);

        if(a == 0 || b == 0 || n == 0 || l < 2 || o < 2) return 0;

        int res = Integer.MAX_VALUE;
        res = Math.min(res, a / 1); 
        res = Math.min(res, b / 1); 
        res = Math.min(res, n / 1); 
        res = Math.min(res, l / 2); 
        res = Math.min(res, o / 2); 

        return res;
    }
}