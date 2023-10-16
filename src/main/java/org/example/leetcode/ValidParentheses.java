package org.example.leetcode;


import java.util.Stack;

/**
 https://leetcode.com/problems/valid-parentheses
 **/
public class ValidParentheses {

    public boolean isValid(String s) {

        boolean isValid;

        do {
            int oldLength = s.length();

            s = s.replace("()","");
            s = s.replace("[]","");
            s = s.replace("{}","");

            isValid = oldLength != s.length();
        } while (!s.isEmpty() && isValid);

        return isValid;
    }

    public boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
