class Solution {
    public int reverse(int x) {
        try{
        if(x == 0) return 0;
        StringBuilder str = new StringBuilder();
        if(x < 0) str.append("-");
        x = Math.abs(x);
        while(x != 0){
            str.append(x % 10);
            x /= 10;
        }
        return Integer.parseInt(str.toString());
        } catch (NumberFormatException e){
            return 0;
        }
    }
}