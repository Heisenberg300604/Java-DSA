class Solution {
    public int trap(int[] height) {
        int leftMax = 0 , rightMax = 0 , total = 0;
        int right = height.length -1;
        int left = 0;
        while(right> left){
            leftMax = Math.max(leftMax , height[left] );
            rightMax = Math.max(rightMax , height[right] );
            if(leftMax < rightMax){ // left is small and this becomes the deciding factor
                total+= leftMax - height[left];
                left++;
            }else{
                total+= rightMax - height[right];
                right--;
            }
        }
        return total;
    }
}
