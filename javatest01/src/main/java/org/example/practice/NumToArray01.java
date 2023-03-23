package org.example.practice;

import java.util.Arrays;

public class NumToArray01 {
    public static int[] NumToArray01Solution(long n) {

//        char[] charList = Long.toString(n).toCharArray();
//        int[] answer = new int[charList.length];
//
//        int j = 0;
//        for(int i = charList.length-1; i >= 0; i--){
//            answer[i] = charList[charList.length-1-i]-'0';
//        }

        String s = String.valueOf(n);
        int[] answer = new int[s.length()];

        for(int i = 0, j = s.length()-1 ; i < s.length(); i++,j--){
            answer[i] = (int)s.charAt(j) - '0';

        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }
}
