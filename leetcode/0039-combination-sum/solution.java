class Solution {
    public void combine(List<List<Integer>> result, int[] candidates, int target, List<Integer> combination, int index,
            int sum) {
        if (sum == target) {
            result.add(new ArrayList<>(combination));
            return;
        }
        if (index >= candidates.length || sum > target) {
            return;
        }

        combination.add(candidates[index]);
        sum += candidates[index];
        combine(result, candidates, target, combination, index, sum);
        combination.remove(combination.size() - 1);
        sum -= candidates[index];
        combine(result, candidates, target, combination, index + 1, sum);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        combine(result, candidates, target, combination, 0, 0);
        return result;
    }
}
