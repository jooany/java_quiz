package org.example.practice;

import java.util.Stack;

public class StackEx02 {
    /*
        Stack을 사용하여 해결한 이유 :
        ArrayList는 데이터 변경 시, 배열의 크기를 변경해야 하기 때문에 메모리를 재할당하고 복사하는 비용이 발생함.
        Stack은 데이터 변경 시, 배열의 크기를 변경할 필요가 없음.
     */

    public static int[] StackEx02Soulution() {
        // 예시 input
        // 원하는 결과 : [1,3,0,1]
        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        Stack stack = new Stack();

        for(int a : arr){
            // 마지막으로 push 한 값이 현재 push 하려는 값과 같을 경우에만 push 하지 않는다.
            if(!stack.empty()){
                if( (int)stack.peek() != a){
                    stack.push(a);
                }
            }else {
                stack.push(a);
            }
        }

        int[] answer = new int[stack.size()];
        for(int i = stack.size()-1; i >= 0; i--){
            answer[i] = (int)stack.pop();
        }

        return answer;
    }
    /*
        문제 설명
        배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,

        arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
        arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
        배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.

        제한사항
        배열 arr의 크기 : 1,000,000 이하의 자연수
        배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수
     */
}
