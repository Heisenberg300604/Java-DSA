class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder result = new StringBuilder();

        int carry = 0;
        int sum = 0 ;

        while (i >= 0 || j >= 0) {
            int digitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int digitB = (j >= 0) ? b.charAt(j) - '0' : 0;

           sum = digitA ^ digitB ^ carry;
           carry = (digitA & digitB) | (digitA & carry) | (digitB & carry);

            result.append(sum);
            i--;
            j--;
        }

        if (carry == 1) result.append(1);

        return result.reverse().toString();
    }
}
