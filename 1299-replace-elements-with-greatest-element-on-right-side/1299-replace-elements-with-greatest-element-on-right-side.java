class Solution {
    public int[] replaceElements(int[] arr) {
        int[] a = {-1};
        IntStream.iterate(arr.length - 1, i -> i >= 0, i -> i - 1)
                 .forEach(i -> {
                    int temp = arr[i];
                    arr[i] = a[0];
                    a[0] = Math.max(a[0], temp); 
                 });
                 return arr;
    }
}
    //     int n = arr.length;
    //    IntStream.range(0, n-1)
    //             .forEach(i -> {
    //                  arr[i] =  IntStream.range(i + 1, n)
    //                           .map(j -> arr[j])
    //                           .max()
    //                           .getAsInt();
    //    });

    //     arr[n - 1] = -1;
    //     return arr;
