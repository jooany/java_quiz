package org.example.practice;

public class MathEx02 {
    public static int solution(){
        /*
        문제 : 자연수 n이 주어졌을 때, n의 다음 큰 숫자는 다음과 같이 정의 합니다.

        조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
        조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
        조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.
        n은 1,000,000 이하의 자연수 입니다.
        예를 들어서 78(1001110)의 다음 큰 숫자는 83(1010011)입니다.

        자연수 n이 매개변수로 주어질 때, n의 다음 큰 숫자를 return 하는 solution 함수를 완성해주세요.

         */

        // answer와 n 을 같은 값으로 설정한다.
        int n = 78;
        int answer = 78;

        // 2진법 변환 후 1의 개수
        int nOneNum = Integer.bitCount(n);
        int ansOneNum = 0;

        // 반복문을 돌 때마다 n에 1을 더한 값의 2진법 변환 후 1의 개수를 구한다.
        // n과 answer 2진법의 1의 개수가 같을 때 answer를 반환한다.
        while(ansOneNum != nOneNum){
            ansOneNum = Integer.bitCount(++answer);
        }

        return answer;
    }
}
