class Solution {
    public String reversePrefix(String word, char ch) {
        int n = word.length();
        int i=0; 
        int start = 0;
        char [] arr =  word.toCharArray();

        while(i<n && arr[i] != ch){
            i++;
        }
            
        if(i == n){
            return word;
        }

        int end = i;

        while(start<end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return new String (arr);
    }
}