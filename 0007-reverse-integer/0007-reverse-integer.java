class Solution {
    public int reverse(int x) {
        if(x == 0) return 0;
        long rev = 0L;
        while(x != 0){
            rev = rev * 10 + (x%10);
            x /= 10;
        }
        return (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) ? 0 :  (int) rev;
        // try{
        // if(x == 0) return 0;
        // StringBuilder str = new StringBuilder();
        // if(x < 0) str.append("-");
        // x = Math.abs(x);
        // while(x != 0){
        //     str.append(x % 10);
        //     x /= 10;
        // }
        // return Integer.parseInt(str.toString());
        // } catch (NumberFormatException e){
        //     return 0;
        // }
    }
}