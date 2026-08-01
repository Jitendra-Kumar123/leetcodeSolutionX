class Solution {
    public int balancedStringSplit(String s) {
        int n = s.length();
        int balance =0, count =0;
        for(int i=0; i<n; i++){
            if(s.charAt(i) == 'R'){
                balance++;
            }
            else{
                balance--;
            }
            if(balance == 0){
                count++;
            }
        }
        return count;
    }
}