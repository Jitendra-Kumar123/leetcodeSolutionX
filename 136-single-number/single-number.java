class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            boolean found = false;
            for(int j= 0; j<n; j++){
                if(nums[i] == nums[j] && i!= j){
                    found = true;
                    break;
                }
            }
            if(!found){
                    return nums[i];
            }
        }
        return 0;
    }
}