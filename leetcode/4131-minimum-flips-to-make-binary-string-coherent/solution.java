class Solution {
    public int minFlips(String s) {
        int n = s.length();
        int ones = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                ones++;
            }
        }

        int ans = Math.min(Math.max(0, ones - 1), n - ones);

        if (n >= 2) {
            int temp = ones;

            if (s.charAt(0) == '0') {
                temp++;
            } else {
                temp--;
            }

            if (s.charAt(n - 1) == '0') {
                temp++;
            } else {
                temp--;
            }

            ans = Math.min(ans, temp);
        }

        return ans;
    }
}

