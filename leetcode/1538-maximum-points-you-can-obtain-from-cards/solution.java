class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int max_score = 0 ; 
        int n = cardPoints.length;
        int left_sum = 0 ; 
        int right_sum = 0;
        for(int i = 0 ; i < k ;i++){
            left_sum += cardPoints[i];
        }
        max_score = left_sum;
        int right = n-1;
        for(int i = k-1 ; i >=0 ;i--){
            left_sum = left_sum - cardPoints[i];
            right_sum += cardPoints[right];
            right--;
            max_score = Math.max(max_score,left_sum+right_sum);
        }
        
        return max_score;
    }
}
