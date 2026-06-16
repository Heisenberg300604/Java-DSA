class Solution {
    public String processStr(String s) {
        int n = s.length();
        StringBuilder result = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '*') {
                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            } else if (s.charAt(i) == '#') {
                result.append(result);
            } else if (s.charAt(i) == '%') {
                result.reverse();
            } else {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}
