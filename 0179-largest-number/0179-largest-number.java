class Solution {
    public String largestNumber(int[] nums) {

        if(Arrays.stream(nums).allMatch(i -> i == 0)) return "0";
        
         return Arrays.stream(nums)
                .mapToObj(String::valueOf)
                .sorted((a, b) -> (b+a).compareTo(a+b))
                .collect(Collectors.joining()); 
    }
}