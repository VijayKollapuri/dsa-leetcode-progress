class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char minChar = letters[0];
       for(int i = 0; i < letters.length; i++) {
        if(letters[i] > target) {
            minChar = letters[i];
            break;
        }
       }
       return minChar;
    }
}