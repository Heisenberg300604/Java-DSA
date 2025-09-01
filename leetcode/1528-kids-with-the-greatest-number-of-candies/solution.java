class Solution {
    public int max_candies(int [] arr){
        int maxIndex = 0 ;
        for(int i =1; i<arr.length;i++){
            if(arr[i]>arr[maxIndex]){
                maxIndex = i;
            }
        }
        return arr[maxIndex];
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // we will first check the max candy in the array 
        int max = max_candies(candies);
        List<Boolean> ans = new ArrayList<>();
        // then we will check for each array index 
        for(int i = 0 ; i<candies.length; i++){
            if(candies[i]+extraCandies >= max){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
}
