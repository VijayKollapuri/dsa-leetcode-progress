// class Solution {
//     public boolean backspaceCompare(String s, String t) {
//         Stack<Character> s1 = new Stack<>();
//         Stack<Character> s2 = new Stack<>();
//         for(char c : s.toCharArray()){
//             if(c == '#') {
//                 if(!s1.isEmpty())
//                     System.out.println(s1.pop());
//                 // s1.removeFirst();
//             } else
//             s1.push(c);
//         }

//         for(char c : t.toCharArray()){
//             if(c == '#') {
//                 if(!s2.isEmpty())
//                System.out.println(s2.pop());
//             } else
//             s2.push(c);
//         }

//         // StringBuilder sb1 = new StringBuilder();
//         // for(char c : s1) sb1.append(c);

//         // StringBuilder sb2 = new StringBuilder();
//         // for(char c : s2) sb2.append(c);

//         // System.out.println(sb1 + " " + sb2);
//         // return sb1.toString().equals(sb2.toString());

//         return (s1.equals(s2));
        
//     }
// }

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '#') {
                if(!stack1.isEmpty()) stack1.pop();
            } else {
                stack1.push(ch);
            }
        }

         for(char ch : t.toCharArray()){
            if(ch == '#') {
                if(!stack2.isEmpty()) stack2.pop();
            } else {
                stack2.push(ch);
            }
        }

        return stack1.equals(stack2);
    }
}