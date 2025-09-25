class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers and multiples of 10 (except 0) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        // If number is even digits -> x == reversed
        // If odd digits -> x == reversed / 10 (middle digit ignored)
        return x == reversed || x == reversed / 10;
    }
}
