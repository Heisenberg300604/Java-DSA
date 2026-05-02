class Solution {
    public void combine(List<List<Integer>> result, int[] candidates, List<Integer> combination, int target, int sum,
            int index) {
                if (sum == target) {
                result.add(new ArrayList<>(combination));
                return;
            }
            if (sum > target) return;
        for (int i = index; i < candidates.length; i++) { // iterate at the same level
            if (i > index && candidates[i] == candidates[i - 1])
                continue;
            if (sum + candidates[i] > target) break;
            combination.add(candidates[i]);
            combine(result, candidates, combination, target, sum + candidates[i], i + 1);
            combination.remove(combination.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        combine(result, candidates, new ArrayList<>(), target, 0, 0);
        return result;
    }
}
