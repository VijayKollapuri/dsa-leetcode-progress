class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split("\\s+");
        int n = arr.length;
        if(pattern.length() != n) return false;
        HashMap<Character, String> map = new HashMap<>();
        for(int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            if(map.containsKey(ch)) {
                if(!map.get(ch).equalsIgnoreCase(arr[i])) return false;
            } else {
                if(map.containsValue(arr[i])) return false;
                map.put(ch, arr[i]);
            }
        }
        return true;
    }
}