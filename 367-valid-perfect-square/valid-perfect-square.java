class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 1, high = num/2;

        if(num == 1){
            return true;
        }

        while(low<=high){
            int mid = low + (high - low)/2;
            if(mid == num/mid && num % mid ==0){
                return true;
            }
            else if(mid < num/mid){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return false;
    }
}