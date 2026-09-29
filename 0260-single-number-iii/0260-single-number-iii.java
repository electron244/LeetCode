class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int[] res = new int[2];
        int idx = 0 ;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                res[idx++] = entry.getKey();
                if(idx ==2 )break;
            }
        }
        return res;
    }
}