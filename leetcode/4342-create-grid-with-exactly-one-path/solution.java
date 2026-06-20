class Solution {
    public String[] createGrid(int m, int n) {
        String[] validPath = new String[m]; // acc to row size
        char[][] grid = new char[m][n];

        for(int j = 0 ; j < m ;j++){ // filling up entire array with #
            Arrays.fill(grid[j] , '#');        
        }

        for(int i = 0 ; i < n ;i++){
            grid[0][i] = '.';
        }
        
        for(int j = 0 ; j < m ; j++){
            grid[j][n-1] = '.';
        }

        for(int i = 0 ; i < m ;i++){
            validPath[i] = new String(grid[i]);
        }

        return validPath;
    }
}
