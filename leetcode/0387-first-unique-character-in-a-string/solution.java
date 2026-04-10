class Solution {
    public int firstUniqChar(String s) {
       char[] arr = s.toCharArray(); // convert string to char array
       int[] freq = new int[26];
       for(int i = 0 ; i < arr.length;i++){
            int index = arr[i] - 'a';
            freq[index]++;
       }

       for(int i = 0 ; i < arr.length;i++){
            int index = arr[i] - 'a';
            if(freq[index] == 1){
                return i;
            }
       }
       
        return -1;
    }
}
