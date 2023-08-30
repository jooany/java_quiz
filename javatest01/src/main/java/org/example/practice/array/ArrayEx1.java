package org.example.practice.array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 문제 : 교점에 별 만들기 - Level 2
 * 문제 유형 : 2차원 배열 활용
 * 시간복잡도 : O(N^2)
 * 헷갈리거나 새로 배운 것 :
     * 1. Arrays.fill(배열,배열의 자료형 값) : 값으로 배열 초기화 할 수 있다.
     * 2. 우리가 익숙한 X,Y 좌표는 X는 → , Y는 ↑ 인데 배열에서는 Y축 방향이 ↓ 임으로 명심해야 한다.
     * 3. 배열에서 행은 Y 좌표, 열은 X 좌표
 */
public class ArrayEx1 {
    private static class Point{
        public final long x,y;
        private Point(long x, long y){
            this.x = x;
            this.y = y;
        }
    }

    private static Point getIntersectionPoint(long a1, long b1, long c1, long a2, long b2, long c2){
        double x = (double) (b1*c2 - c1*b2) / (a1*b2 - b1*a2);
        double y = (double) (c1*a2 - a1*c2) / (a1*b2 - b1*a2);

        if(x != (long)x || y != (long)y){
            return null;
        }

        return new Point((long) x,(long) y);
    }

    private static Point getMaxPoint(List<Point> pointList){
        Long xMax = Long.MIN_VALUE;
        Long yMax = Long.MIN_VALUE;
        for(Point p : pointList){
            if(p.x > xMax) xMax = p.x;
            if(p.y > yMax) yMax = p.y;
        }
        return new Point(xMax, yMax);
    }

    private static Point getMinPoint(List<Point> pointList){
        Long xMin = Long.MAX_VALUE;
        Long yMin = Long.MAX_VALUE;

        for(Point p : pointList){
            if(p.x < xMin) xMin = p.x;
            if(p.y < yMin) yMin = p.y;
        }

        return new Point(xMin, yMin);
    }


    public static String[] solution(int[][] line) {
        List<Point> pointList = new ArrayList<>();
        for(int i=0; i < line.length; i++){
            for(int j=i+1; j < line.length; j++){

                Point intersectionPoint = getIntersectionPoint(line[i][0], line[i][1], line[i][2], line[j][0], line[j][1], line[j][2]);

                if(intersectionPoint != null){
                    pointList.add(intersectionPoint);
                }
            }
        }
        Point maxPoint = getMaxPoint(pointList);
        Point minPoint = getMinPoint(pointList);

        // 배열의 크기는 int형
        int xMax = (int)maxPoint.x;
        int yMax = (int)maxPoint.y;
        int xMin = (int)minPoint.x;
        int yMin = (int)minPoint.y;
        int width = xMax - xMin + 1;
        int height = yMax - yMin + 1;


        char[][] arr = new char[height][width];
        for(char[] row : arr){
            Arrays.fill(row, '.'); // 하나의 배열의 원소로 문자 '.'을 가짐
        }

        for(Point p : pointList){
            arr[yMax -(int) p.y][(int)p.x - xMin] = '*';
        }

        String[] answer = new String[arr.length];
        for(int i=0; i<answer.length; i++){
            answer[i] = new String(arr[i]);
        }

        return answer;
    }
}
