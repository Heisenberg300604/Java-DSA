class Solution {
    public void combination(int[] candidates, int target, int start,
                            List<Integer> num, int total, List<List<Integer>> result) {

        if (total == target) {
            result.add(new ArrayList<>(num));
            return;
        }

        if (total > target) return;

        for (int i = start; i < candidates.length; i++) {

            if (i > start && candidates[i] == candidates[i - 1]) continue;

            if (total + candidates[i] > target) break;

            num.add(candidates[i]);
            combination(candidates, target, i + 1, num, total + candidates[i], result);
            num.remove(num.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        combination(candidates, target, 0, new ArrayList<>(), 0, result);
        return result;
    }
}

