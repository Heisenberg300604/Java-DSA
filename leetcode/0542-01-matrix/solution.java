class Node {
    int row, col, dist;
    Node(int row, int col, int dist) {
        this.row = row;
        this.col = col;
        this.dist = dist;
    }
}

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int[][] dist = new int[n][m];
        boolean[][] vis = new boolean[n][m];

        Queue<Node> q = new LinkedList<>();

        // Step 1: push all 0s
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    q.offer(new Node(i, j, 0));
                    vis[i][j] = true;
                }
            }
        }

        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        // Step 2: BFS
        while (!q.isEmpty()) {
            Node node = q.poll();

            for (int i = 0; i < 4; i++) {
                int nr = node.row + dr[i];
                int nc = node.col + dc[i];

                if (nr >= 0 && nr < n && nc >= 0 && nc < m && !vis[nr][nc]) {
                    vis[nr][nc] = true;
                    dist[nr][nc] = node.dist + 1;
                    q.offer(new Node(nr, nc, node.dist + 1));
                }
            }
        }

        return dist;
    }
}
