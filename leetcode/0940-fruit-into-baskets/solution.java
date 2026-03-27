class Solution {
    // fruits in basket --> longest subarray with atmost 2 distinct numbers
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxFruits = 0;
        int left = 0;
        int right = 0;

        while (right < fruits.length) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1); // expanding right

            while (map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++;
            }
            int window = right - left + 1;
            maxFruits = Math.max(window, maxFruits);
            right++;
        }
        return maxFruits;

    }
}
