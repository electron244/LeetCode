class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int bestSum = sum;

        int l = 0;
        int r = k;

        while (r < n) {
            sum -= nums[l];
            l++;

            sum += nums[r];
            r++;

            bestSum = Math.max(bestSum, sum);
        }

        return (double) bestSum / k;
    }
}