class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        int n = path.length();
        String[] parts = path.split("/");

        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                continue;
            } else if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(part);
            }
        }
        if (stack.isEmpty()) return "/";

        StringBuilder result = new StringBuilder();
        
        // Rebuild the canonical path by appending each directory in stack order
        for (String dir : stack) {
            result.append("/").append(dir);
        }

        return result.toString();
    }
}
