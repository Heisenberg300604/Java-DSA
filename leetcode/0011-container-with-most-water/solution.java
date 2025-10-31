class Solution {
    public int maxArea(int[] height) {
        // to return the max amount of water a container can have 
        int n = height.length;
        int i = 0 ;
        int j = n-1;
        int max_area = 0;
        while(j>i){
            int current_area = (j-i) * Math.min(height[i],height[j]);
            if(current_area>max_area){
                max_area = current_area;
            }
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max_area;
    }
}
