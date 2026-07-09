class Solution {
    public int[] shuffle(int[] nums, int n) {
        int j=n;
        int k=0;
        int [] ans = new int [nums.length];
        for(int i=0; i<n; i++){
            ans[k] = nums[i];
            k++;
            ans[k] = nums[j];
            k++;
            j++;
        }
        return ans;
    }
}