class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        Stack<String> st = new Stack<>();
        
        for (String word : words) {
            st.push(word);
        }
        
        String last = st.pop();  // get last word
        return last.length();
    }
}
