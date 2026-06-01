class Solution {
    public int minimumCost(int[] cost) {
        int totalCost = 0;
        Arrays.sort(cost); // in ascending order
        int candies = 0 ;
        for(int i = cost.length-1 ; i >= 0 ;i--){
            if(candies == 2){
                candies = 0;
                continue;
            }
            candies++;
            totalCost += cost[i];
        }
        return totalCost;
    }
}
