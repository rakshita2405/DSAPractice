class Solution {
    public int lengthOfLastWord(String s) {
         String[] str = s.trim().split(" "); // trim() removes leading and trailing spaces
        return str[str.length - 1].length();
    }
}
