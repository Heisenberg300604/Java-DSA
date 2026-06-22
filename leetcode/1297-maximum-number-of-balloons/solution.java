class Solution {
    public int maxNumberOfBalloons(String text) {
        int maxBalloons = 0;
        int[] characters = new int[26];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int index = c - 'a';
            characters[index]++;
        }
        int b = characters['b' - 'a'];
        int a = characters['a' - 'a'];
        int l = characters['l' - 'a'] / 2;
        int o = characters['o' - 'a'] / 2;
        int n = characters['n' - 'a'];

        return Math.min(b , 
        Math.min(a , 
        Math.min(l ,
        Math.min(o , 
        n))));
    }
}
