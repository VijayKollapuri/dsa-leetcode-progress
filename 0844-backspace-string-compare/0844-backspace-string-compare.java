class Solution {
    public boolean backspaceCompare(String s, String t) {
        ArrayDeque<Character> s1 = new ArrayDeque<>();
        ArrayDeque<Character> s2 = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(c == '#') {
                if(!s1.isEmpty())
                    System.out.println(s1.removeLast());
                // s1.removeFirst();
            } else
            s1.add(c);
        }

        for(char c : t.toCharArray()){
            if(c == '#') {
                if(!s2.isEmpty())
               System.out.println(s2.removeLast());
            } else
            s2.add(c);
        }

        StringBuilder sb1 = new StringBuilder();
        for(char c : s1) sb1.append(c);

        StringBuilder sb2 = new StringBuilder();
        for(char c : s2) sb2.append(c);

        System.out.println(sb1 + " " + sb2);
        return sb1.toString().equals(sb2.toString());
        
    }
}