class Solution {
    public int addDigits(int num) {
        // if(num <= 9) return num;
        
        return num == 0 ? 0 : (num % 9 == 0 ? 9 : num % 9);
        

    }
}