class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int[] result = new int[2];
        int sumA = 0, sumB = 0;
        for (int a : aliceSizes)
            sumA += a;
        Set<Integer> setB = new HashSet<>();
        for (int b : bobSizes) {
            sumB += b;
            setB.add(b);
        }

        int delta = (sumB - sumA) / 2;

        for (int a : aliceSizes) {
            if (setB.contains(a + delta)) {
                result[0] = a;
                result[1] = a + delta;
                return result;
            }
        }

        return null;

    }
}
