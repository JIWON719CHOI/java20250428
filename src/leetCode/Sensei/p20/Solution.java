package leetCode.Sensei.p20;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            // 닫힌 괄호면
            // stack 에서 pop 한 것과 비교
            // 매치가 되면 계속 진행, 아니면 return false
            switch (c) {
                case ']' -> {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char open = stack.pop();
                    if (open != '[') {
                        return false;
                    }
                }
                case '}' -> {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char open = stack.pop();
                    if (open != '{') {
                        return false;
                    }
                }
                case ')' -> {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char open = stack.pop();
                    if (open != '(') {
                        return false;
                    }
                }
                default -> {
                    // 열린 괄호면 stack 에 push
                    stack.push(c);
                }
            }

        }
        return stack.isEmpty();
    }
}