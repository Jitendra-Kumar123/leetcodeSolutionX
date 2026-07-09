class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int max = candies[0];

        List<Boolean> result = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(candies[i] >= max){
                max = candies[i];
            }
        }

        for(int i=0; i<n; i++){
            int currentCandies= candies[i] + extraCandies;
            if(max <= currentCandies){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}