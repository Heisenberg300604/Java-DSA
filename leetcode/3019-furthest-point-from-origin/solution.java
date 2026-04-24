class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int maxDist = 0 ;
        int lefts = 0 ;
        int rights = 0;
        int blanks = 0;

        for(int i = 0 ; i < moves.length(); i++){
            if(moves.charAt(i) == 'L'){
                lefts++;
            }
            else if(moves.charAt(i) == 'R'){
                rights++;
            }else{
                blanks++;
            }
        }
        return Math.abs(rights - lefts) + blanks;
    }
}
