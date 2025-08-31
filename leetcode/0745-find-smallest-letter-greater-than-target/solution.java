class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int low = 0;
        int high = n-1;
        int ans = 0;
        while(high>= low){
            int mid = (high+low)/2;
            if(letters[mid] > target){
                ans = mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return letters[ans];
    }
}
