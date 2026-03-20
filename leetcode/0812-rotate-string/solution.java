class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
            return false;
        // notice a thing when we do s+s we get all the possibilities of formation of the string
        String newString = s + s;
        return newString.contains(goal);
    }
}
