package leetcode;

import java.util.Stack;

public class Valid_Parentheses {
    public static void main(String[] args) {
        String s = "{}";
        System.out.println(validparentheses(s));
    }

    public static boolean validparentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else {
                if (!stack.empty()) {
                    char a = stack.pop();
                    if (a == '[' && s.charAt(i) != ']') {
                        return false;
                    }
                    if (a == '{' && s.charAt(i) != '}') {
                        return false;
                    }
                    if (a == '(' && s.charAt(i) != ')') {
                        return false;
                    }

                } else {
                    return false;
                }
            }
        }
        return true;
    }

}
