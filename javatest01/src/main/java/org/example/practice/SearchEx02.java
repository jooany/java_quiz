package org.example.practice;

import java.util.LinkedList;
import java.util.Queue;

public class SearchEx02 {
/*
문제 :
m X n 의 크기의 맵에 캐릭터는 (1,1) 의 위치에서 시작하여 (n,m)의  목표지점까지 이동해야 한다.
캐릭터는 동, 서, 남, 북 방향으로 한 칸씩 이동한다.
최단 경로로 도착 시, 캐릭터가 지나는 칸은 모두 몇 칸인지 구하십시오.

제한사항 :
maps는 n x m 크기의 게임 맵의 상태가 들어있는 2차원 배열로, n과 m은 각각 1 이상 100 이하의 자연수입니다.
n과 m은 서로 같을 수도, 다를 수도 있지만, n과 m이 모두 1인 경우는 입력으로 주어지지 않습니다.
maps는 0과 1로만 이루어져 있으며, 0은 벽이 있는 자리, 1은 벽이 없는 자리를 나타냅니다.
처음에 캐릭터는 게임 맵의 좌측 상단인 (1, 1) 위치에 있으며, 상대방 진영은 게임 맵의 우측 하단인 (n, m) 위치에 있습니다.

나의 풀이 : BFS 알고리즘을 통해 최단거리를 구한다.

    **/
    public static int solution(int[][] maps) {
        int answer = -1;
//        maps = new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        int[] move = {1, 0, -1, 0};
        int n = maps.length;
        int m = maps[n-1].length;

        boolean visited[][] = new boolean[n][m];
        Queue<int[]> queue = new LinkedList<>();

        // queue 에는 { y, x, 지나온 칸의 개수 }를 담은 int 배열을 저장한다.
        queue.offer(new int[]{0,0,1}); // 큐에 시작점 추가
        visited[0][0] = true; // 시작점 방문 기록

        while(!queue.isEmpty()){ // 큐에 값이 없을 때까지 반복
            int[] currentQue = queue.poll(); // 큐의 첫번째 값을 삭제하며 반환
            int y = currentQue[0];
            int x = currentQue[1];
            int sum = currentQue[2];

            // 캐릭터가 목표 지점에 도달한 경우
            if( y == n-1 && x == m-1) {
                answer = sum;
                break;
            }

            // 현재 캐릭터의 위치에서 동,서,남,북으로 이동하는 경우의 수만큼 반복
            for(int i=0; i<4; i++){
                // 이동한 좌표값 명시적 초기화
                int cY = y + move[i];
                int cX = x + move[3-i];

                // 이미 방문했거나, 벽에 닿아 이동할 수 없다면 continue
                if( cY < 0 || cX <0 || cX >= m || cY >=n  || maps[cY][cX] == 0 || visited[cY][cX]) continue;

                // 해당 좌표값으로 이동할 수 있다면
                queue.offer(new int[]{cY, cX, sum+1}); // queue에 현재 캐릭터가 이동가능한 좌표 및 칸 수 추가
                visited[cY][cX] = true; // 방문 기록
            }
        }

        return answer;
    }
}

