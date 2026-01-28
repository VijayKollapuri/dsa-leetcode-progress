class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] arr = new int[26];
        for(char c : text.toCharArray()) {
            arr[c - 'a']++;
        }
        
        int count = Integer.MAX_VALUE;
        count = Math.min(count, (arr[0]/1));
        count = Math.min(count, (arr[1]/1));
        count = Math.min(count, (arr[11]/2));
        count = Math.min(count, (arr[14]/2));
        count = Math.min(count, (arr[13]/1));
        return count;
    }
}