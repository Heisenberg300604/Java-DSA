class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> numbers = new HashMap<String, Integer>();
        numbers.put("I", 1);
        numbers.put("V", 5);
        numbers.put("X", 10);
        numbers.put("L", 50);
        numbers.put("C", 100);
        numbers.put("D", 500);
        numbers.put("M", 1000);
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = numbers.get(String.valueOf(s.charAt(i)));
            if (i < s.length() - 1) {
                int next = numbers.get(String.valueOf(s.charAt(i+1)));
                if(current < next ){
                    total -= current;
                    continue;
                }
            }
            total += current;

        }
        return total;
    }
}
