package org.example.practice;

import java.util.Stack;

public class StackEx01 {
    public static boolean StackEx01Solution() {
        String s = "(())()";    // 성공 예시
//        String s = "(()()";   // 실패 예시

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {  //스택이 이미 비어있으면 false
                    return false;
                } else if (stack.peek() == '(') {   // 스택의 최신값이 ( 이면 제거
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
