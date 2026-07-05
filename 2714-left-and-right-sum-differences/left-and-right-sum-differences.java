class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int sum = 0; 
        int cumu_sum = 0;
        int leftSum = 0;
        int rightSum = 0;
        int [] result = new int [n];

        for(int i=0; i<n; i++){
            sum += nums[i];
        }

        for(int i=0; i<n; i++){
            leftSum = cumu_sum;
            cumu_sum += nums[i];
            rightSum = sum - cumu_sum;
            result[i] = Math.abs(rightSum - leftSum);
        }
        return result;
    }
}