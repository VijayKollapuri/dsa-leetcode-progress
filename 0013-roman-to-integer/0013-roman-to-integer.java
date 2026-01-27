class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);

        int res = 0;
        int prev = 0;
        for(int i = s.length()-1; i >= 0; i--) {
            int n = map.get(s.charAt(i)+"");
            if(n < prev) {
                res -= n;
            }
             else res += n;
              prev = n;
        }
        return res;
    }
}