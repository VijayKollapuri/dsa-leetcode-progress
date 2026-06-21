class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        if(costs[0] > coins) return 0;
        int howMany = 0;
        for(int i : costs) {
            if(i <= coins) {
                coins -= i;
                howMany++;
            } else {
                break;
            }
        }
        return howMany;
    }
}