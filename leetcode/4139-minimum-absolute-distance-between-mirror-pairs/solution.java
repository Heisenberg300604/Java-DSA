class Solution {
    public int reverse(int n) {
        int m = 0;

        while (n > 0) {
            int digit = n % 10;
            m = m * 10 + digit;
            n = n / 10;
        }

        return m;
    }

    public int minMirrorPairDistance(int[] nums) {
        int minDist = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        for (int n : nums) {
            if (map.containsKey(n)) {
                minDist = Math.min(minDist, i - map.get(n));
            }
            int rev = reverse(n);
            map.put(rev, i);
            i++;
        }

        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
}
