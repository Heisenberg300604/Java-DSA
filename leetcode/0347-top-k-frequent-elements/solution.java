class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (int n : freqMap.keySet()) {
            int count = freqMap.get(n);
            if (buckets[count] == null) {
                buckets[count] = new ArrayList<>();
            }
            buckets[count].add(n);
        }

        int[] res = new int[k];
        int idx = 0;

        for (int i = buckets.length-1; i >= 0 && idx < k; i--) {
            if (buckets[i] != null) {
                for (int n : buckets[i]) {
                    res[idx++] = n;
                    if (idx == k)break;
                }
            }
        }
        return res;
    }
}
