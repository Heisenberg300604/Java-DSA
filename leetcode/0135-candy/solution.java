class Solution {
    public int candy(int[] ratings) {
       int n = ratings.length;
        int[] candies = new int[n];
        
        Arrays.fill(candies, 1);
        // The first pass handles the first inequality.
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // we did right to left pass as it can fail some test cases too like [ 4,3,2,1 ]
        // The second pass handles the second inequality.
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // sum all of em and that is your answer
        int total = 0;
        for (int c : candies) {
            total += c;
        }

        return total;
    }
}
