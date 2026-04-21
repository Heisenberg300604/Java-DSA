class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int V = graph.length;

        // Reverse graph
        List<List<Integer>> rev = new ArrayList<>();
        for(int i = 0; i < V; i++) {
            rev.add(new ArrayList<>());
        }

        // Build reversed edges + indegree
        int[] indegree = new int[V];

        for(int i = 0; i < V; i++) {
            for(int it : graph[i]) {
                rev.get(it).add(i);   // reverse edge
                indegree[i]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < V; i++) {
            if(indegree[i] == 0) {
                q.offer(i);
            }
        }

        List<Integer> safe = new ArrayList<>();

        while(!q.isEmpty()) {
            int node = q.poll();
            safe.add(node);

            for(int parent : rev.get(node)) {
                indegree[parent]--;
                if(indegree[parent] == 0) {
                    q.offer(parent);
                }
            }
        }

        Collections.sort(safe);
        return safe;
    }
}
