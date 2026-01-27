class Solution {
    public String intToRoman(int num) {
        // HashMap<Integer, String> map = new HashMap<>();
        // map.put(1,"I");
        // map.put(5,"V");
        // map.put(10,"X");
        // map.put(50,"L");
        // map.put(100,"C");
        // map.put(500,"D");
        // map.put(1000,"M");

        String[] str = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] arr = {1000,900,500,400,100,90,50,40,10,9,5,4,1};

        StringBuilder res = new StringBuilder();
        
        for(int i=0; i< arr.length; i++) {
            while(num >= arr[i]) {
                res.append(str[i]);
                num -= arr[i];
            }
        }
        return res.toString();
    }
}