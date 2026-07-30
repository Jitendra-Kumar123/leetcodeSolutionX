class Solution {
    public String interpret(String command) {
        int n = command.length();
        StringBuilder sb = new StringBuilder();
        

        for(int i=0; i<n; i++){
            char ch = command.charAt(i);
            if(ch == 'G'){
                sb.append(ch);
            }
            else if(ch == '(' && command.charAt(i+1) == ')'){
                sb.append("o");
            }
            else if(ch == '(' && command.charAt(i+1) == 'a' && command.charAt(i+2) == 'l' && command.charAt(i+3) == ')'){
                sb.append("al");
            }
        }
        return sb.toString();
    }
}