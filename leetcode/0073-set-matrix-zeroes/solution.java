class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] rows = new boolean[matrix.length];
        boolean[] cols = new boolean[matrix[0].length];

        // traverse the matrix

        for(int i = 0 ; i < matrix.length ;i++){
            for(int j = 0 ; j < matrix[0].length ;j++){
                if(matrix[i][j] == 0){
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        // traversing the matrix again 
        for(int i = 0 ; i < matrix.length ;i++){
            for(int j = 0 ; j < matrix[0].length ;j++){
                if(rows[i] == true ){
                    matrix[i][j] = 0;
                }else if(cols[j] == true){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
