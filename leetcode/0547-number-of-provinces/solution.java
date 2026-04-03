class Solution {
    public void dfs(int node, boolean[] visited, List<List<Integer>> adjLs) {
        visited[node] = true;
        for (int it : adjLs.get(node)) {
            if (!visited[it]) {
                dfs(it, visited, adjLs);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int number_of_provinces = 0;
        int V = isConnected.length;
        // convert the adj matrix to list 
        List<List<Integer>> adjLs = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjLs.add(new ArrayList<>());
        }

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (isConnected[i][j] == 1 && i != j) {
                    adjLs.get(i).add(j);
                }
            }
        }
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                number_of_provinces++;
                dfs(i, visited, adjLs);
            }
        }
        return number_of_provinces;
    }
}
