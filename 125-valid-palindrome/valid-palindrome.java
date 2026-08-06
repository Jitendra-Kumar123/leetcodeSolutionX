class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if((ch >= 'A' && ch <= 'Z') || 
            (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')){
                sb.append(ch);
            }
        }

       String str = sb.toString().toLowerCase();
        int i=0, j= str.length()-1;
        while(i<=j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}