class Solution {
    public int[] scoreValidator(String[] events) {
        int score = 0 ; 
        int counter = 0 ; 

        for(int i = 0 ; i < events.length ; i++){
            String ch = events[i];
            if (counter == 10) {
                break;
            }
            if(ch.equals("0") || ch.equals("1") || ch.equals("2") || ch.equals("3") || ch.equals("4") || ch.equals("6") ){
                int num = Integer.parseInt(ch);
                score += num;
            }
            if(ch.equals("WD") || ch.equals("NB")){
                score++;
            }if(ch.equals("W")){
                counter++;
            }
        }

        return new int[]{score , counter};
    }
}
