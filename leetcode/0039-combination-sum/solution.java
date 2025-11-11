class Solution {

    private void makeCombination(int[] candidates, int target,int index ,List<Integer> comb ,int total, List<List<Integer>> res){
        if(total == target){
            res.add(new ArrayList<>(comb));
            return;
        }
        if(total>target || index >= candidates.length){
            return ;
        }
        comb.add(candidates[index]);
        makeCombination(candidates , target , index, comb,total+candidates[index],res);
        comb.remove(comb.size() - 1);
        makeCombination(candidates , target , index+1, comb,total,res);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        makeCombination(candidates , target , 0, new ArrayList<>(),0,res);
        return res;
    }
}
