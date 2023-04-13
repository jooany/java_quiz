package org.example.practice;

public class SearchEx01 {
    /*
     <문제>
     완전탐색
     중앙에는 노란색으로 칠해져 있고 테두리 1줄은 갈색으로 칠해져 있는 격자 모양 카펫
     갈색 격자의 수 brown, 노란색 격자의 수 yellow가 매개변수로 주어질 때 카펫의 가로, 세로 크기를 순서대로 배열에 담아 return


     <해결방안>
     구해야할 것은 갈색 격자의 가로와 세로의 수이다.
     노란색 격자의 가로, 세로에 2씩 더 한 값은 갈색 격자의 가로, 세로의 수가 된다.

     세로는 1, 가로는 (brown-4)/2 -1 로 초기화하여 while문을 반복할 때마다, 세로는 1씩 더하고 가로는 1씩 빼면서
     [노란색 격자의 가로 + 노란색 격자의 세로 = (갈색 격자의 수-4)/2] 인 것을 이용하여 [가로*세로 = 노란색 격자의 수]가 되는 경우를 찾아
     노란색 격자의 가로+2, 노란색 격자의세로+2를 더한 값을 배열에 담아 return 한다.

    * */
    public static int[] solution(int brown, int yellow) {
//         도출되어야 하는 return 값 : [8,6]
//        brown = 24;
//        yellow = 24;

        // 노란색 격자의 가로,세로 -> widthNum, heightNum
        int widthNum = (brown-4)/2 - 1;
        int heightNum = 1;
        boolean isNotFounded = true;

        while(isNotFounded){

            if(heightNum * widthNum == yellow){
                isNotFounded = false;
                break;
            }
            heightNum++;
            widthNum--;
        }

        return new int[]{widthNum+2, heightNum+2};
    }
}
