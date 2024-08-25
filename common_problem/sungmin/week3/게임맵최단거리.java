import java.util.*;

class Solution {

    public int solution(int[][] maps) {
        int n = maps.length;        // 맵 행 크기
        int m = maps[0].length;     // 맵 열 크기

        boolean[][] visited = new boolean[n][m];

        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{0, 0, 1});
        visited[0][0] = true;

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        // 큐가 빌 때까지 반복
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int distance = current[2];

            // 도착점에 도달 후 현재까지의 거리
            if (x == n - 1 && y == m - 1) {
                return distance;
            }
            // 상하좌우 네 방향으로 이동
            for (int i = 0; i < 4; i++) {
                int nextX = x + dx[i];
                int nextY = y + dy[i];

                if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < m &&
                        !visited[nextX][nextY] && maps[nextX][nextY] == 1) {

                    queue.add(new int[]{nextX, nextY, distance + 1});
                    visited[nextX][nextY] = true;
                }
            }
        }
        return -1;
    }
}