class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>(); // result array
        if (matrix == null || matrix.length == 0) return result; // empty matrix case
        // we need 4 pointers here (top row → right column → bottom row → left column)
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while(top<=bottom && left <= right){
            // left -> right
            for(int i = left ; i <= right ; i++){ 
            result.add(matrix[top][i]);
            }
            top++;
            //top to bottom 
            for(int i = top ; i <= bottom ; i++ ){
                result.add(matrix[i][right]);
            }
            right--;  // shrink it

            // right to left; ( check first )
            if(top<= bottom){
                for(int i = right ; i >= left ; i-- ){
                result.add(matrix[bottom][i]);
            }
            bottom--;
            }
            // bottom → top 
            if(left<=right){
                for(int i = bottom ; i >= top ; i-- ){
                result.add(matrix[i][left]);
            }
            left++;
            }
        }
        return result;
    }
}
