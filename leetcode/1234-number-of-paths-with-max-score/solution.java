class Solution {
    int n; // globally declared n so that we dont need to pass on n in every function
    int MOD = 1_000_000_007;
    int[][] tScore;
    int[][] tPaths;

    private int getIntFromChar(char ch) {
        if (ch == 'S') {
            return 0;
        }
        return ch - '0';
    }

    private boolean isValid(int i, int j, List<String> board) {
        return i >= 0 && i < n && j >= 0 && j < n && board.get(i).charAt(j) != 'X';
    }

    private int[] solve(int i, int j, List<String> board) {
        char here = board.get(i).charAt(j);

        if (here == 'E') {
            return new int[] { 0, 1 };
        }

        if (here == 'X')
            return new int[] { 0, 0 };
  
        if (tScore[i][j] != -1)
            return new int[]{tScore[i][j], tPaths[i][j]};

        int upScore = 0, upPaths = 0;
        int leftScore = 0, leftPaths = 0;
        int diagScore = 0, diagPaths = 0;

        if (isValid(i - 1, j, board)) {
            int[] r = solve(i - 1, j, board);
            upScore = r[0];
            upPaths = r[1];
            if (upPaths > 0)
                upScore += getIntFromChar(here);
        }
        if (isValid(i, j - 1, board)) {
            int[] r = solve(i, j - 1, board);
            leftScore = r[0];
            leftPaths = r[1];
            if (leftPaths > 0)
                leftScore += getIntFromChar(here);
        }

        if (isValid(i - 1, j - 1, board)) {
            int[] r = solve(i - 1, j - 1, board);
            diagScore = r[0];
            diagPaths = r[1];
            if (diagPaths > 0)
                diagScore += getIntFromChar(here);
        }
        int bestScore = Math.max(upScore, Math.max(leftScore, diagScore));
        int bestPaths = 0;

        if (upScore == bestScore)
            bestPaths = (bestPaths + upPaths) % MOD;
        if (leftScore == bestScore)
            bestPaths = (bestPaths + leftPaths) % MOD;
        if (diagScore == bestScore)
            bestPaths = (bestPaths + diagPaths) % MOD;

        tScore[i][j] = bestScore;
        tPaths[i][j] = (int)(((long) bestPaths) % MOD);
        return new int[]{tScore[i][j], tPaths[i][j]};
    }

    public int[] pathsWithMaxScore(List<String> board) {
        n = board.size();
        tScore = new int[n][n];
        tPaths = new int[n][n];
        for (int[] row : tScore) Arrays.fill(row, -1);
        return solve(n - 1, n - 1, board);
    }
}
