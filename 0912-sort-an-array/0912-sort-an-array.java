class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    public void mergeSort(int[] arr,int left,int right){
        if(left>=right) return;
        int mid = left+(right-left)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }
    public void merge(int[] arr,int left,int mid,int right){
        int i = left;
        int j = mid+1;
        int k= 0 ;
        int[] temp = new int[right-left+1];
        while(i<=mid && j<=right){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k] = arr[i];
            k++;
            i++;
        }
        while(j<=right){
            temp[k] = arr[j];
            k++;
            j++;
        }
        for(int x =0;x<temp.length;x++){
            arr[left+x] = temp[x];
        }
    }
}