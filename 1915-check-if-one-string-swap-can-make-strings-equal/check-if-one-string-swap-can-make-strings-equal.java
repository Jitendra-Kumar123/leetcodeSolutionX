class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n = s1.length();
        int mismatch = 0;
        int first = -1;
        int second = -1;

        for(int i=0; i<n; i++){
            if(s1.charAt(i) != s2.charAt(i)){
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
            return true;
        }

        if(mismatch != 2){
            return false;
        }

        return s1.charAt(first) == s2.charAt(second) && s1.charAt(second) == s2.charAt(first); 
    }
}