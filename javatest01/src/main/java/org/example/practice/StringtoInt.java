package org.example.practice;

public class StringtoInt {
    public static boolean stringToInTsolution(int x) {
        boolean answer = true;
        String s = String.valueOf(x);
        int n = 0;

        for (int i = 0; i < s.length(); i++) {
            n += s.charAt(i) - '0'; // 문자를 숫자로 전환
        }

        if (x % n == 0) {
            return true;
        }

        return false;
    }
}
