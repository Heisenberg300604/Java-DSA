class Solution {
    public double findDiag(int length , int breadth){
        double diag = Math.sqrt(length * length + breadth * breadth);
        return diag;
    }
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int max_area = 0;
        double max_diag = 0;
        for(int i = 0 ; i < dimensions.length ;i++){
            double curr_diag = findDiag(dimensions[i][0] ,dimensions[i][1] );
            if(curr_diag > max_diag || (curr_diag == max_diag && dimensions[i][0] * dimensions[i][1]> max_area)){
                max_area = dimensions[i][0]*dimensions[i][1];
                max_diag = curr_diag;
            }
        }
        return max_area;
    }
}
