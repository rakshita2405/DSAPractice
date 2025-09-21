class Solution {
    public boolean isPalindrome(String s) {
        String sb = s.trim();
        int n = sb.length();

        for (int i = 0, j = n - 1; i < j; ) {
            char left = sb.charAt(i);
            char right = sb.charAt(j);

            // Skip non-alphanumeric characters
            if (!Character.isLetterOrDigit(left)) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(right)) {
                j--;
                continue;
            }

            // Compare ignoring case
            if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
