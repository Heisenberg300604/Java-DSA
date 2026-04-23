class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0 ; i < queries.length ;i++ ){
            String current_q = queries[i];
            for(int j = 0 ; j < dictionary.length; j++){
                String current_d = dictionary[j];
                int count = 0 ;
                for(int check = 0 ; check < current_q.length();check++){
                    if(current_q.charAt(check)!=current_d.charAt(check)){
                        count++;
                    }
                    if(count > 2) break;
                }
                if(count <=2){
                    result.add(current_q);
                    break;
                }
            }
        }
        return result;
    }
}
