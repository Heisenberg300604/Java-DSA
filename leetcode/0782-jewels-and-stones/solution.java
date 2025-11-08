class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int isJewel = 0;
        HashSet<Character> jewel = new HashSet<Character>();
        for(int i = 0 ; i<jewels.length();i++){
            jewel.add(jewels.charAt(i));
        }

        for(int i = 0 ; i<stones.length();i++){
            if(jewel.contains(stones.charAt(i))){
                isJewel++;
            }
        }

        return isJewel;
    }
}
