class Solution {
    String[] map = new String[] { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public void helper(List<String> result, String digits, int index, String current) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }
        String s = map[digits.charAt(index) - '0'];
        for (int i = 0; i < s.length(); i++) {
            helper(result, digits, index + 1, current + s.charAt(i));
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        helper(result, digits, 0, "");
        return result;
    }
}
