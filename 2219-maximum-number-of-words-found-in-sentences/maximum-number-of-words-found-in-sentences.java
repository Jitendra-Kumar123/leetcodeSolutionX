class Solution {
    public int mostWordsFound(String[] sentences) {
        int n = sentences.length;
        int max = 0;

        for(int i=0; i<n; i++){
            String s = sentences[i];
            int count = 1;

            for(int j=0; j<s.length(); j++){
                if(s.charAt(j) == ' '){
                    count++;
                }
            }

            if(count > max){
                max = count;
            }
        }

        return max;
    }
}