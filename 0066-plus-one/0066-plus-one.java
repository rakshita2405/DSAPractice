class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // done
            }
            digits[i] = 0; // carry over
        }
        // if all digits were 9
        int[] result = new int[digits.length + 1];
        result[0] = 1; // rest are 0 by default
        return result;
    }
}
