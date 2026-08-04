class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int j = 0;
        Arrays.sort(nums);

        int start = nums[0];
        int end = nums[nums.length - 1];
    
        for (int i = start; i <= end; i++) {
            if (j < nums.length && nums[j] == i) {
                j++;
            } else {
                ans.add(i);
            }
        }
        return ans; 
    }
}