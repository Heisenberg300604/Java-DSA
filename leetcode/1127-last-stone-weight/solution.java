class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // we need a max heap
        for(int i = 0 ; i < stones.length ; i++){
            pq.add(stones[i]);
        }

        while(pq.size() > 1){
            int x = pq.poll();
            int y = pq.poll();
            if(x!= y){
                int newNo = Math.abs(x-y);
                pq.add(newNo);
            }
        }
        return pq.isEmpty() ? 0 : pq.peek();
    }
}
