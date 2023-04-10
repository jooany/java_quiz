package org.example.practice;

import java.util.Arrays;

public class MakeMin {
    public static int MakeMinSolution (){
        int[] A = {1,4,2};
        int[] B = {5,4,4};
        int answer = 0;

        // 배열 오름차순 정렬
        Arrays.sort(A);
        Arrays.sort(B);

        // 작은 값 X 큰 값 으로 합하여 누적
        for(int i=0, j=A.length-1; i<A.length; i++,j--){
            answer += A[i] * B[j];
        }

        return answer;
    }
}
