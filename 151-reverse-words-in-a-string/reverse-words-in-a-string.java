class Solution {
    public String reverseWords(String s) {
        String str = new StringBuilder(s).reverse().toString();
        char [] arr = str.toCharArray();

        int n = arr.length;
        int i=0;

        while(i < n){
            while(i<n && arr[i] == ' '){
                i++;
            }
            int l= i;

            while(i<n && arr[i] != ' '){
                i++;
            }
            int r = i-1;

            while(l<r){
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        i = 0;

        while (i < n) {
            while (i < n && arr[i] == ' ') {
                i++;
            }

            if (i >= n) {
                break;
            }

            if (sb.length() > 0) {
                sb.append(' ');
            }

            while (i < n && arr[i] != ' ') {
                sb.append(arr[i]);
                i++;
            }
        }

    return sb.toString();
    }
}