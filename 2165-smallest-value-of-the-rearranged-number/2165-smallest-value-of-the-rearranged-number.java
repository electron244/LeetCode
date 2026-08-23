class Solution {
    public long smallestNumber(long num) {

        if (num == 0) {
            return 0;
        }

        boolean negative = num < 0;

        String s = String.valueOf(Math.abs(num));

        char[] digits = s.toCharArray();

        if (negative) {

            Arrays.sort(digits);

            reverse(digits);

            return -Long.parseLong(new String(digits));

        } else {

           
            Arrays.sort(digits);

           
            int i = 0;

            while (digits[i] == '0') {
                i++;
            }

            char temp = digits[0];
            digits[0] = digits[i];
            digits[i] = temp;

            return Long.parseLong(new String(digits));
        }
    }

    private void reverse(char[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}