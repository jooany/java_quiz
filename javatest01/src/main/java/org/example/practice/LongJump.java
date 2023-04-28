package org.example.practice;

/*
    문제 설명 >
    효진이는 멀리 뛰기를 연습하고 있습니다. 효진이는 한번에 1칸, 또는 2칸을 뛸 수 있습니다. 칸이 총 4개 있을 때, 효진이는
    (1칸, 1칸, 1칸, 1칸)
    (1칸, 2칸, 1칸)
    (1칸, 1칸, 2칸)
    (2칸, 1칸, 1칸)
    (2칸, 2칸)
    의 5가지 방법으로 맨 끝 칸에 도달할 수 있습니다. 멀리뛰기에 사용될 칸의 수 n이 주어질 때, 효진이가 끝에 도달하는 방법이 몇 가지인지 알아내, 여기에 1234567를 나눈 나머지를 리턴하는 함수, solution을 완성하세요. 예를 들어 4가 입력된다면, 5를 return하면 됩니다.

    제한 사항 >
    n은 1 이상, 2000 이하인 정수입니다.
    ------------------------------------------------------------------------------
    해결 방안 >
    칸이 1씩 늘어날 수록 n-2 + n-1 = n 로 피보나치 수열의 규칙을 띄고 있다.
 */
public class LongJump {
    public static long solution() {
        int n = 5;
        long answer = 0;

        long b_before = 0;
        long before = 1;

        for(int i=1; i<=n; i++){
            answer = (b_before + before) % 1234567;
            b_before = before;
            before = answer;
        }

        return answer;
    }
}
