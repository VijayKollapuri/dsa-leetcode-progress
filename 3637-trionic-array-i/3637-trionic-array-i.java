class Solution {
    public boolean isTrionic(int[] nums) {
        boolean p=false, q=false, r=false;
        int i = 0;
        while(i < nums.length - 1 &&  nums[i] < nums[i+1]) {
            p = true;
            System.out.println("One " + i + ": " + nums[i]);
            i++;
        }
        // i--;
            
        while((0 < i) &&  i < nums.length - 1 && nums[i] > nums[i+1]) {
            System.out.println("Two " + i + ": " + nums[i]);
            i++;
            q = true;
        }
           
        while((0 < i) &&  i < nums.length - 1 && nums[i] < nums[i + 1]) {
            System.out.println("Three " + i + ": " + nums[i]);
            i++;
            r = true;
        }

        if(i != nums.length - 1) r = false;

        return ((p && q)&& r);
    }
}