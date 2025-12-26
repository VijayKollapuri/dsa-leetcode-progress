class Solution {
    public int bestClosingTime(String customers) {
    // int hour = 0, n = customers.length(), minPenalty = Integer.MIN_VALUE;
    // LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
    // for(char c : customers.toCharArray()){
    //     if(c == 'Y') minPenalty += 1;
    // } 
    // map.putIfAbsent(0,minPenalty);
    // boolean isClosed = false;
    //     for(int i=1; i<n; i++){
    //         if(customers.charAt(i) == 'Y') isClosed = true;
    //         int curPenalty = 0;
    //         for(int j = i; j < n; j++){
    //             if(customers.charAt(j) == 'Y') curPenalty += 1;
    //             if(isClosed) curPenalty += 1;
    //         }
    //         map.putIfAbsent(i, curPenalty);
    //         isClosed = false;
    //     }

    //     for(Map.Entry<Integer,Integer> entry : map.entrySet()){
    //         if(entry.getValue() < minPenalty) {
    //             hour = entry.getKey();
    //             minPenalty = entry.getValue();
    //         }
    //     }
    //     return hour;
    
        int score = 0, bestScore = 0, bestHour = 0;
        for (int i = 0; i < customers.length(); i++) {
            score += (customers.charAt(i) == 'Y') ? 1 : -1;
            if (score > bestScore) {
                bestScore = score;
                bestHour = i + 1; // close after this hour
            }
        }
        return bestHour;
    }
}
