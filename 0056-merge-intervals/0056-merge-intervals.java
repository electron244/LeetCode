class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> result = new ArrayList<>();
        for(int[] arr:intervals){
            if(result.isEmpty() || arr[0] > result.get(result.size()-1)[1]){
                result.add(arr);
            }else{
                int[] last = result.get(result.size()-1);
                last[1] = Math.max(last[1],arr[1]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}