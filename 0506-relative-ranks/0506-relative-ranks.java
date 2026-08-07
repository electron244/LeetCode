class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] medals = score.clone();
        Arrays.sort(medals);
        int left = 0 ;
        int right = medals.length-1;
        while(left < right){
            int temp = medals[left];
            medals[left] = medals[right];
            medals[right] = temp;
            left++;
            right--;
        }

        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<medals.length;i++){
            map.put(medals[i],i+1);
        }
        String[] ans = new String[score.length];

        for(int i = 0 ;i<=score.length-1;i++){
            if(map.get(score[i]) == 1){
                ans[i] = "Gold Medal";
            }else if(map.get(score[i]) == 2){
                ans[i] = "Silver Medal";
            }else if(map.get(score[i]) == 3){
                ans[i] = "Bronze Medal";
            }else{
                ans[i] = Integer.toString(map.get(score[i]));
            }
        }
        return ans;
    }
}