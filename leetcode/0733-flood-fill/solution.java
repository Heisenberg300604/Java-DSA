class Solution {
    public void bfs(int sr, int sc, int[][] image, boolean[][] visited, int newColor, int originalColor) {
        int n = image.length;
        int m = image[0].length;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { sr, sc });
        while (!q.isEmpty()) {
            int[] cell = q.poll();
            int r = cell[0];
            int c = cell[1];
            image[r][c] = newColor;
            visited[r][c] = true;
            //check all the four directions
            int[][] directions = {
                    { -1, 0 }, // up
                    { 0, 1 }, // right
                    { 1, 0 }, // down
                    { 0, -1 } // left
            };
            for (int i = 0; i < 4; i++) {
                int nr = r + directions[i][0];
                int nc = c + directions[i][1];
                if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
                    if (!visited[nr][nc] && image[nr][nc] == originalColor) {
                        q.add(new int[] { nr, nc });
                        visited[nr][nc] = true;
                    }
                }
            }
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int n = image.length;
        int m = image[0].length;
        int originalColor = image[sr][sc];

        boolean[][] visited = new boolean[n][m];

        bfs(sr, sc, image, visited, newColor, originalColor);
        return image;
    }
}

