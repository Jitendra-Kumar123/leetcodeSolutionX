class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] ans = new String[words.length];
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int position = word.charAt(word.length() - 1) - '1';
            ans[position] = word.substring(0, word.length() - 1);
        }

        for (int i = 0; i < ans.length; i++) {
            sb.append(ans[i]);
            if (i != ans.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}