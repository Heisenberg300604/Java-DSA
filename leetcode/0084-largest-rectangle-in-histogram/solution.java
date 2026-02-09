class Solution {

private int[] findNSE(int[] arr) {
    
    int n = arr.length;
    
    int[] ans = new int[n];
    
    Stack<Integer> st = new Stack<>();
    
    // Start traversing from the back
    for(int i = n - 1; i >= 0; i--) {
        
        int currEle = arr[i];
        
        /* Pop the elements in the stack until 
        the stack is not empty and the top 
        element is not the smaller element */
        while(!st.isEmpty() && 
              arr[st.peek()] >= arr[i]){
            st.pop();
        }
        
        ans[i] = !st.isEmpty() ? st.peek() : n;
        
        /* Push the index of current 
        element in the stack */
        st.push(i);
    }
    
    return ans;
}

private int[] findPSE(int[] arr) {
    
    int n = arr.length;
    
    int[] ans = new int[n];
    
    Stack<Integer> st = new Stack<>();

    for(int i=0; i < n; i++) {

        int currEle = arr[i];
        
        /* Pop the elements in the stack until 
        the stack is not empty and the top 
        elements is not the smaller element */
        while(!st.isEmpty() && 
              arr[st.peek()] >= arr[i]){

            st.pop();
        }
        
        ans[i] = !st.isEmpty() ? st.peek() : -1;
        
        /* Push the index of current 
        element in the stack */
        st.push(i);
    }
    
    return ans;
}

public int largestRectangleArea(int[] heights) {
    
    /* Determine the next and 
    previous smaller elements */
    int[] nse = findNSE(heights);
    int[] pse = findPSE(heights);
    
    int largestArea = 0;
    
    // store current area
    int area;

    for(int i=0; i < heights.length; i++) {
        
        area = heights[i] * (nse[i]-pse[i]-1);
        
        largestArea = Math.max(largestArea, area);
    }
    
    return largestArea;
      }
};

