class Solution {
    public boolean buddyStrings(String s, String goal) {
        int n = s.length();
        int mismatch = 0;
        int first = -1;
        int second = -1;

        if (s.length() != goal.length()) {
            return false;
        }

        for(int i=0; i<n; i++){
            if(s.charAt(i) != goal.charAt(i)){
                mismatch++;
                if(first == -1){
                    first = i;
                }
                else{
                    second = i;
                }
            }
        }

        if(mismatch == 0){
            int[] freq = new int[26];

            for (int i = 0; i < n; i++) {

                freq[s.charAt(i) - 'a']++;

                if (freq[s.charAt(i) - 'a'] > 1) {
                    return true;
                }
            }            
            return false;
        }

        if(mismatch != 2){
            return false;
        }

        return s.charAt(first) == goal.charAt(second) 
        && s.charAt(second) == goal.charAt(first);
    }
}