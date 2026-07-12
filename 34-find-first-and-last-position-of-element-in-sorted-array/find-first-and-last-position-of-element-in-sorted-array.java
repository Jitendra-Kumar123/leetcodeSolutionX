class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int idx1 = -1;
        int idx2 =-1;
        int low1 = 0, high1=n-1, low2=0, high2= n-1;
        ArrayList<Integer> result = new ArrayList<>();
        
        while(low1 <= high1){
            int mid = low1 + (high1 - low1)/2;
            if(nums[mid] > target){
                high1 = mid-1;
            }
            
            else if(nums[mid] < target){
                low1 = mid+1;
            }
            else{
                idx1 = mid;
                high1 = mid-1;
                
            }
        }
        
        while(low2 <= high2){
            int mid = low2 + (high2 - low2)/2;
            if(nums[mid]> target){
                high2 = mid-1;
            }
            
            else if(nums[mid] < target){
                low2 = mid+1;
            }
            else{
                idx2 = mid;
                low2 = mid+1;
                
            }
        }   

        result.add(idx1);
        result.add(idx2);
        
        return new int[]{idx1, idx2};
    }
}