class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int zeros = 1; 

        for (int i = 0; i < flowerbed.length; i++) {

            if (flowerbed[i] == 0) {
                zeros++;
            } 
            else {
                n -= (zeros - 1) / 2;
                zeros = 0;
            }
        }
        n -= zeros / 2;

        return n <= 0;
    }
}