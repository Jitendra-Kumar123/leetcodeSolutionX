class Solution {
    public char findTheDifference(String s, String t) {
        int [] sFreq = new int [26];
        int [] tFreq = new int [26];

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int sIdx = ch - 'a';
            sFreq[sIdx]++;
        }

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            int tIdx = ch - 'a';
            tFreq[tIdx]++;
        }

        for(int i=0; i<26; i++){
            if(sFreq[i] != tFreq[i]){
                return (char)(i + 'a');
            }
        }
        return (char)-1;
    }
}