class Solution {
    public void topoSort(int N, List<List<Integer>> adj, List<Integer> topo) {
        int[] inDegree = new int[N];

        for (int i = 0; i < N; i++) {
            for (int it : adj.get(i)) {
                inDegree[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            if (inDegree[i] == 0)
                q.add(i);
        }

        while (!q.isEmpty()) {
            int node = q.poll();

            topo.add(node);

            for (int it : adj.get(node)) {
                inDegree[it]--;

                if (inDegree[it] == 0)
                    q.add(it);
            }

        }
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int N = numCourses;
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            adj.add(new ArrayList<>());
        }

        for (int it[] : prerequisites) {
            int u = it[0];
            int v = it[1];

            adj.get(v).add(u);
        }

        List<Integer> topo = new ArrayList<>();

        topoSort(N, adj, topo);

        if (topo.size() < N)
            return new int[0];

        int[] result = new int[topo.size()];
        for (int i = 0; i < topo.size(); i++) {
            result[i] = topo.get(i);
        }
        return result;
    }
}
