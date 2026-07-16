class Solution {
    public int maximumCount(int[] nums) {
       int n = nums.length;
       int low1 = 0, high1 =n-1, idx1 = -1;
       int low2 = 0, high2 =n-1, idx2 = -1;
       int posCount = 0, negCount = 0;

       while(low1<=high1){
        int mid = low1 + (high1-low1)/2;
        if(nums[mid]>=0){
            high1 = mid -1;
        }
        else{
            idx1 = mid;
            low1 = mid + 1;
        }
       }

       if(idx1 != -1){
        negCount = idx1 + 1;
       }

        while(low2<=high2){
            int mid = low2 + (high2-low2)/2;
        if(nums[mid] <=0){
            low2 = mid + 1;
        }
        else{
            idx2 = mid;
            high2 = mid - 1;
        }
       }

       if(idx2 != -1){
        posCount = n-idx2;
       }

       int max = Math.max(posCount, negCount);
       return max;
    }
}