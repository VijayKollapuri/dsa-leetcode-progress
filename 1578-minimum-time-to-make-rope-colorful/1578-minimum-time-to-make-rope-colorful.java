class Solution {
    public int minCost(String colors, int[] nm) {
        int max = 0;
        char ch[]  = colors.toCharArray();
        int i = 1, n = 0,  j = ch.length;
        boolean is = false;
        
        while(i < j) {
            while(i < j && ch[i] == ch[n]) {
                i++;
                is = true; 
                System.out.println(i + " n: " + n);
                 }

            if(is)
            max += sum(Arrays.copyOfRange(nm, n, i));

            n = i;
            is = !is;
            i++;
        }
        return max;
       
    }

    private static int sum(int[] arr) {
       int sum = 0, id = 0;
       for(int i = 1; i < arr.length; i++) {
        if(arr[i] > arr[id]) id = i;
       }

       for(int i = 0; i < arr.length; i++) {
        if(i == id) continue;
        sum += arr[i];
       }
       return sum;
    }
}