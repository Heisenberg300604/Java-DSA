class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        // we can use hashet
        Set<Integer> on = new HashSet<>();
        // check if element exist..
        for (int b : bulbs) {
            if (on.contains(b)) {
                on.remove(b);
            } else { // if not then add em 
                on.add(b);
            }
        }
        // result array
        List<Integer> result = new ArrayList<>(on);
        // sort the array
        Collections.sort(result);
        // return result
        return result;
    }
}
