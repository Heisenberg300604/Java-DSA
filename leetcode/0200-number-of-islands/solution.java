class Solution {
    public void bfs(int i , int j ,boolean[][] visited ,char[][] grid ){
        Queue<int[]> queue = new LinkedList<>();
        visited[i][j] = true;
        queue.add(new int[]{i ,j});
        int n = grid.length; 
        int m = grid[0].length;
        while(!queue.isEmpty()){
            int[] cell = queue.poll();
            int row = cell[0];
            int col = cell[1];

            // traverse the 4 neighbors
            for(int dr = -1; dr <= 1; dr++){
                for(int dc = -1; dc <= 1; dc++){
                    if(dr == 0 && dc == 0) continue;
                    if(Math.abs(dr) + Math.abs(dc) == 2) continue;
                    int nrow = row + dr;
                    int ncol = col + dc;
                    if(nrow>= 0 && nrow < n && ncol >= 0 && ncol < m && !visited[nrow][ncol] && grid[nrow][ncol] =='1'){
                        visited[nrow][ncol] = true;
                        queue.add(new int[]{nrow , ncol});
                    }
                }
            }
        }
    }

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int islands = 0;
       boolean [][] visited = new boolean[n][m];

       for(int i = 0 ; i < n ;i++){
            for(int j = 0; j< m ;j++){
                if(!visited[i][j] && grid[i][j] == '1'){
                    islands++;
                    bfs(i , j , visited , grid);
                }
            }
       }
       return islands;
    }
}
