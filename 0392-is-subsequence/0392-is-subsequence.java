class Solution {
   public boolean isSubsequence(String s, String t) {
    int i = 0, j = 0;  // i -> s, j -> t
    while (i < s.length() && j < t.length()) {
        if (s.charAt(i) == t.charAt(j)) {
            i++;  // match found, move s pointer
        }
        j++;  // always move t pointer
    }
    return i == s.length();  // if all chars of s matched
}
}