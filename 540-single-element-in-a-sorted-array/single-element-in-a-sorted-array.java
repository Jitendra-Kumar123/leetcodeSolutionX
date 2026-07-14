class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int low = 0, high = n-1;
             
        if(n==1){
            return nums[0];
        }
        
        if(nums[0] !=nums[1]){
            return nums[0];
        }
        if(nums[n-1] !=nums[n-2]){
            return nums[n-1];
        }
        
        while(low<=high){
            int mid = low + (high - low) /2;
            
            if(nums[mid] !=nums[mid+1] && nums[mid] !=nums[mid-1]){
                return nums[mid];
            }
            
            int first= mid;
            int last = mid;
            
            if(nums[mid-1]==nums[mid]){
                first = mid - 1;
            }
            
            else{
                last = mid + 1;
            }
            
            int leftCount = first - low;
            int rightCount = high - last;
            
            if(leftCount % 2 == 0){
                low = last + 1;
            }
            
            else{
                high = first - 1;
            }
        }

        return -1;
    }
}