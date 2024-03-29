package org.example;

import org.example.practice.array.ArrayEx1;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
//        //입력
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        // 풀이과정
//        int answer = 0;
//        String bString = String.valueOf(st.countTokens());
//
//        for(int i=0; i<a; i++){
//            answer += (int) bString.charAt(i)-'0';
//        }
//
//
//        // 출력
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        bw.write(answer); // 버퍼에 넣을 내용
//        bw.flush(); // 내용 출력
//        bw.close();



//        NumToArray01.NumToArray01Solution(12345);
//        System.out.println(StringtoInt.stringToInTsolution(18));

        // 할인 행사
//        DiscountSale.DiscountSaleSolution(new String[]{"banana", "apple", "rice", "pork", "pot"},
//                                            new int[]{3, 2, 2, 2, 1},
//                                        new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"});
//
        // OpenChat 카카오 오픈채팅
//        OpenChat.OpenChatSolution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"});

        // Stack활용 : 괄호 쌍 체크
//        System.out.println(StackEx01.StackEx01Solution());

        // Stack활용2 : 같은 숫자반복X
//        System.out.println(Arrays.toString(StackEx02.StackEx02Soulution()));

        // 최솟값 만들기 - 두 배열의 각 원소를 곱해서 누적한 값이 최솟값인 경우 반환
//        System.out.println(MakeMin.MakeMinSolution());

        // 자연수 n을 연속한 자연수의 합으로 표현할 수 있는 방법의 개수
//        System.out.println(MathEx01.MathEx01Solution());

        // 완전탐색
        // 중앙에는 노란색으로 칠해져 있고 테두리 1줄은 갈색으로 칠해져 있는 격자 모양 카펫
        // 갈색 격자의 수 brown, 노란색 격자의 수 yellow가 매개변수로 주어질 때 카펫의 가로, 세로 크기를 순서대로 배열에 담아 return
//        System.out.println(Arrays.toString(SearchEx01.solution(24, 24)));


        // BFS
//        System.out.println(SearchEx02.solution(new int[][]{{1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 1, 1}, {1,1, 0, 1}, {0, 0, 0, 1}}));

        // 다음 큰 숫자
//        System.out.println(MathEx02.solution());

        // 피보나치 수 구하기
//        System.out.println(MathEx03.solution());

        // 짝지어 제거하기
//        System.out.println(RemovePairs.solution());

        // 멀리뛰기
//        System.out.println(LongJump.solution());

        // 영어 끝말잇기
//        System.out.println(Arrays.toString(EnglishEnding.solution()));
        
        // 교점에 별 만들기
        System.out.println(Arrays.toString(ArrayEx1.solution(new int[][]{{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}})));
    }

}