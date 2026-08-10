class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int op = 0;
        int median = nums[nums.length/2];
        for(int num : nums){
            op += Math.abs(median-num);
        }
        return op;
    }
}