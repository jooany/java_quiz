package org.example.practice.array;

/**
 * 문제 : 교점에 별 만들기 - Level 2
 * 문제 유형 : 2차원 배열 활용
 * 시간복잡도 : O(N^2)
 * 문제 풀이 순서 :
 *  1. 2차원 배열 형태로 변경하면, 반시계방향은 아래,오른쪽,왼쪽위 방향이 된다.
 * 헷갈리거나 새로 배운 것 :
 *
**/
public class ArrayEx2 {

    public int[] solution(int n) {
        int[][] arr = new int[n][n];
        int value = 0;
        int x = 0;
        int y = 0;

        while(true){
            while(true){ // 아래
                arr[y][x] = value++;
                if(y+1 == n || arr[y+1][x] != 0) break;
                y++;
            }
            if(x+1 == n || arr[y][x+1] !=0) break;
            x++;

            while(true){ // 오른쪽
                arr[y][x] = value++;
                if(x+1 == n || arr[y][x+1] != 0) break;
                x++;
            }
            if(y-1 == n || arr[y-1][x-1] != 0) break;
            x--;
            y--;

            while(true){ // 왼쪽 위
                arr[y][x] = value++;
                if(arr[y-1][x-1] != 0) break;
            }
            if(y+1 == n || arr[y+1][x] !=0) break;
        }


        int[] answer = {};
        return answer;
    }
}
