class Solution {
    public String reverseWords(String s) {
        //   String s = "Hello world from Java";
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        
         for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) {  // handle multiple spaces safely
                result.append(words[i]);
                if (i > 0) result.append(" ");
            }
        }

        return result.toString().trim();
    }
}