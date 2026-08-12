class Solution {
    public boolean rotateString(String s, String goal) {
                if (s.length() != goal.length()) {
            return false;
        }

        int n = s.length();
        char[] arr = s.toCharArray();

        for (int j = 0; j < n; j++) {

            if (new String(arr).equals(goal)) {
                return true;
            }

            char first = arr[0];

            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[n - 1] = first;
        }

        return false;
    }
}