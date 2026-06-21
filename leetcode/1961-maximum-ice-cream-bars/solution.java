class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs); // sort the cost to find the minimum cost of the ice cream 
        // we need to buy the minimum ice creams first 

        int minBars = 0 ;

        for(int i = 0 ; i < costs.length ; i++){
            if(costs[i] > coins){
                break;
            }else{
                coins = coins-costs[i];
                minBars++;
            }
        }

        return minBars;
    }
}
