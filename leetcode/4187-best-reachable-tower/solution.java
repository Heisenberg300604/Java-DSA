class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        int bestX = -1;
        int bestY = -1;
        int cx = center[0], cy = center[1];
        int bestQ = -1;
        for (int[] t : towers) {
            int x = t[0], y = t[1], q = t[2];
            int dist = Math.abs(x - cx) + Math.abs(y - cy);
            if (dist <= radius) {
                if (q > bestQ) {
                    bestQ = q;
                    bestX = x;
                    bestY = y;
                } else if (q == bestQ) {
                    if (bestX == -1 || x < bestX || (x == bestX && y < bestY)) {
                        bestX = x;
                        bestY = y;
                    }
                }
            }
        }
        return new int[] { bestX, bestY };
    }
}
