class Solution {
    public boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                charStack.push(c);
            } else {
                if (charStack.isEmpty()) {
                    return false;
                }

                if ((c == '}' && charStack.peek() == '{') || 
                    (c == ')' && charStack.peek() == '(') || 
                    (c == ']' && charStack.peek() == '[')) {
                    charStack.pop();
                } else {
                    return false;
                }
            }
        }
        return charStack.isEmpty();
    }
}
