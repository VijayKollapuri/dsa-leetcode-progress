class Solution {
    public String strWithout3a3b(int a, int b) {
        if(a >= b) {
           return make(a, b, 'a', 'b');
        } else {
           return make(b, a, 'b', 'a');
        }
    }

    public static String make(int a, int b, char c, char d) {
        StringBuilder res = new StringBuilder();
        int div = a/2;
        while(a > 0 || b > 0) {
            if(a > 2 && a >= b) {
                res.append(c);
                res.append(c);
                a -= 2;
            } else if(a!=0) {
                res.append(c);
                a -= 1;
            }
            
             if(b > 1 && b > div) {
                res.append(d);
                res.append(d);
                b -= 2;
            } else if(b!=0) {
                res.append(d);
                b -= 1;
            }
        }
        return res.toString();
    }
}