class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] even = new int[n];
        int[] odd = new int[n];
        int x = 0;
        int y= 0;
        for(int num:nums){
            if(num%2==0){
                even[x++] = num;
            }else{
                odd[y++] = num;
            }
        }
        x=0;
        y=0;
        int[] ans = new int[n];
        for(int i = 0;i<n;i++){
            if(i%2==0){
                ans[i] = even[x];
                x++;
            }else{
                ans[i] = odd[y];
                y++;
            }
        }
        return ans;
    }
}