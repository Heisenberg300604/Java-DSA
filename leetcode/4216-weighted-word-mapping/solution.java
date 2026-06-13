class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int n = words.length;
        StringBuilder sb = new StringBuilder();
        while(n-- > 0){
            int sum = 0;
            for(int i = 0 ; i < words[n].length();i++){
                char ch = words[n].charAt(i);
                int index = ch-'a';
                sum+=weights[index];
            }
            int letterback = sum %26;
            sb.append((char)('z'-letterback));
        }

        return sb.reverse().toString();
    }
}
