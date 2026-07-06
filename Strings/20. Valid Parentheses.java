class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a == '}' || a == ')' || a == ']') {
                if (stack.isEmpty()) {
                    return false;
                } else if (a == '}') {
                    if (stack.peek() == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else if (a == ']') {
                    if (stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
            else {
                stack.push(a);
            }
        }

        if (stack.isEmpty()) {
            return true;
        }

        return false;
    }
}