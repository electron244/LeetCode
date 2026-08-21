class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double ans = 0;
        int rem = 0;
        for(int i = 0 ;i<brackets.length;i++){
            int amount = Math.min(income,brackets[i][0]) - rem;
            if(amount>0){
                ans+=amount*brackets[i][1] / 100.0;
            }
            rem = brackets[i][0];
            if(income <= brackets[i][0]) break;
        }
        return ans;
    }
}