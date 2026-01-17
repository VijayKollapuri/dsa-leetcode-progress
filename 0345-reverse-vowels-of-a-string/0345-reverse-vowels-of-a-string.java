class Solution {
    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        StringBuilder str = new StringBuilder();
        char ch[] = s.toCharArray();
        while(i < j) {
                while(i < j && !(helper(ch[i]))) i++;
                while(j > i && !(helper(ch[j]))) j--;
                char temp = ch[i]; 
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
                } 
        return new String(ch);
            }
    
   public boolean helper(char ch) {
    return ("[aeiouAEIOU]".indexOf((ch + ""))) > -1;
   }
}

// if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'u' || ch[i] == 'o' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
//                 // System.out.println(ch[i]);
//                 while(j > i && ((ch[j] != 'a') && (ch[j] != 'e') && (ch[j] != 'i') && (ch[j] != 'o') && (ch[j] != 'u') && (ch[j] != 'A') && (ch[j] != 'E') && (ch[j] != 'I') &&(ch[j] != 'O') && (ch[j] != 'U'))) {
//                     System.out.println(ch[j]);
//                 j--;