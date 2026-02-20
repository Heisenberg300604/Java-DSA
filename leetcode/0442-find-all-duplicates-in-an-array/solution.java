class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int n = nums.length;
        List<Integer> arr = new ArrayList<>();

        for(int x : nums){
            map.put(x, map.getOrDefault(x,0)+1);
        }

        for( Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 2){
                arr.add(entry.getKey());
            }
        }

        return arr;
    }
}
