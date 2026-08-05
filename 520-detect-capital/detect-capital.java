class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int uppercaseCount = 0;

        for(int i=0; i<n; i++){
            if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z'){
                uppercaseCount++;
            }
        }
            if(uppercaseCount == n){
                return true;
            }
            else if(uppercaseCount == 0){
                return true;
            }
            else if(uppercaseCount == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z'){
                return true;
            }
        
        return false;
    }
}