class Solution {
    public int[] sortArray(int[] nums) {
        merge(nums,0,nums.length-1);
        return nums;
    }
    public void merge(int[] arr,int left ,int right){
        if(left>=right) return;
        int mid = left+(right-left)/2;
        merge(arr,left,mid);
        merge(arr,mid+1,right);
        sort(arr,left,mid,right);
    }

    public void sort(int[] nums,int left,int mid,int right){
        int[] temp = new int[right-left+1];
        int i = left;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=right){
            if(nums[i] <= nums[j]){
                temp[k++] = nums[i++];
            }else{
                temp[k++] = nums[j++];
            }
        }
        while(i<=mid){
            temp[k++] = nums[i++];
        }
        while(j<=right){
            temp[k++] = nums[j++];
        }
        for (int x = 0; x < temp.length; x++) {
            nums[left + x] = temp[x];
        }
    }
}