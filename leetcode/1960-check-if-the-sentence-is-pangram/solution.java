class Solution {
    public boolean checkIfPangram(String sentence) {
        // to check if a sentence is pangram or not we need to check if there is repetition of any letter 
        // we take a hashset as repetition does not matters here 
        HashSet<Character> letters = new HashSet<>();
        for (char ch : sentence.toCharArray()){
            if (ch >= 'a' && ch <= 'z') {
                letters.add(ch);
            }
        }
        return letters.size() == 26 ; // if hashset size is 26 then true else false
    }
}
