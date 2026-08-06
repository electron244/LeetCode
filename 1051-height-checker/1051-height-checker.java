class Solution {
    public int heightChecker(int[] heights) {
        int[] ori = heights.clone();
        int[] expt = sortedArray(heights.clone());
        int count = 0;
        for(int i = 0 ;i<=heights.length-1;i++){
            if(expt[i] != ori[i]) count++;
        }
        return count;
    }
    public int[] sortedArray(int[] heights){
        int n = heights.length;
        for(int i = 0;i<n-1;i++){
            int j = i+1;
            while(j > 0 && heights[j-1] > heights[j]){
                int temp = heights[j];
                heights[j] = heights[j-1];
                heights[j-1] = temp;
                j--;
            }
        }
        return heights;
    }
}