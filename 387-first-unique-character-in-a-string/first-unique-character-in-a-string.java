class Solution {
    public int firstUniqChar(String s) {
        int [] freq = new int [26];
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int idx = ch - 'a';
            freq[idx]++;
        }
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int idx = ch - 'a';
            
            if(freq[idx] == 1){
                return i;
            }
        }
        return -1;
    }
}