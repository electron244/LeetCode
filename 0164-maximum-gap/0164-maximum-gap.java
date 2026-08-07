class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int max = 0;
        if(n < 2) return max;
        for(int i = 0;i<n-1;i++){
            if(Math.abs(nums[i] - nums[i+1]) > max){
                max = Math.abs(nums[i] - nums[i+1]);
            }
        }
        return max;
    }
}