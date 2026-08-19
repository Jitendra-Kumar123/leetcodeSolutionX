class Solution {
    public int compress(char[] chars) {
        int i=0,j=0;

        while(i<chars.length){
            char ch = chars[i];
            int count =0 ;

            while(i<chars.length && chars[i] == ch){
                count++;
                i++;
            }

            chars[j] = ch;
            j++;
            if(count > 1){
                String str = String.valueOf(count);
                for(int k=0; k<str.length(); k++){
                    chars[j] = str.charAt(k);
                    j++;
                }
            }
        }
        return j;

    }
}