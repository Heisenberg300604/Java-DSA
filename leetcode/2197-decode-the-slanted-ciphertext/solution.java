class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int n = encodedText.length();
        int col = n / rows;

        char arr[][] = new char[rows][col];
        int k = 0;

        // fill the matrix
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < col ; j++){
                arr[i][j] = encodedText.charAt(k++);
            }
        }

        StringBuilder sb = new StringBuilder();

        // traverse diagonally
        for(int i = 0 ; i < col ; i++){
            int r = 0 ;
            int c = i ;
            while(r<rows && c < col){
                sb.append(arr[r][c]);
                r++;
                c++;
            }
        }

        // we would remove the trailing spaces
        int end = sb.length() - 1;
        while(end >= 0 && sb.charAt(end) == ' '){
            end--;
        }

        return sb.substring(0, end + 1);
    }
}
