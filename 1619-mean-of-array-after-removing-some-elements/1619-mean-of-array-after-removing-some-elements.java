class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int sum = 0;
        int n = arr.length;
        int len = (int) (n*0.05);
        for(int i =len;i<n-len;i++){
            sum += arr[i];
        }
        return (double) sum/(n - (2*len));
    }
}