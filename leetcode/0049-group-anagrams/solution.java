class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> group = new HashMap<>();

        // java mai string immutable hai !!!
        for(String str : strs){
            char [] chars = str.toCharArray(); // convert string to char array sort it then back to string
            Arrays.sort(chars);
            String key = new String(chars);
            if(!group.containsKey(key)){
                group.put(key, new ArrayList<>()); // create new array
            }
                group.get(key).add(str); // add the element to the array 
            
        }
        return new ArrayList<>(group.values()); // return the answer in form of array 
    }
}
