package org.example.practice;

public class MathEx01 {
    public static int MathEx01Solution(){
        /*
        * 시간 복잡도를 O(n) 으로 구현하기 위하여 상대적으로 코드가 더 간결한 이중 for문을 사용하지 않고 while문을 사용하였다.
        * i 에는 연속된 자연수를 더할 때, 첫번째 숫자를 저장한다.
        * j 에는 연속된 자연수를 더할 때, 더해지는 값을 저장한다.
        * i 번째 방법에서 연속된 자연수 j를 합하여 sum이 n이 되는 경우 answer에 1씩 추가한다.
        * */

        int n = 15;
        int answer = 0;

        int i = 1;
        int j = 1;
        int sum = 0;

        while(i <= n){
            sum += j++;

            if(sum == n){
                answer++;
                j = ++i;
                sum = 0;
            }else if(sum > n){
                j = ++i;
                sum = 0;
            }
        }
        return answer;
    }
}
