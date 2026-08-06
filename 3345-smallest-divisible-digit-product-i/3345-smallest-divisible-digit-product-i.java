class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int product =1;
            int ans = n;
            while(ans >0){
                product *= (ans%10);
                ans /= 10;
            }
            if(product % t == 0){
                return n;
            }
            n++;
        }
    }
}