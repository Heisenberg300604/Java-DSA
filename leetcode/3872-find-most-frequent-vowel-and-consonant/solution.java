class Solution {
    public int maxFreqSum(String s) {

        HashMap<Character,Integer> map = new HashMap<>(); // we need only one hashmap

        int maxVowel = 0;
        int maxConsonant = 0;

        for(char c : s.toCharArray()){

            int freq = map.getOrDefault(c,0) + 1;
            map.put(c,freq);

            if(isVowel(c)){
                maxVowel = Math.max(maxVowel,freq);
            }else{
                maxConsonant = Math.max(maxConsonant,freq);
            }
        }

        return maxVowel + maxConsonant;
    }

    private boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}
