import java.util.*;

class Solution {
    // 상하좌우 좌표
    static int[] dirX = {1, 0, -1, 0};
    static int[] dirY = {0, 1, 0, -1};
    int[][] maps;

    public int solution(int[][] maps) {
        this.maps = maps;

        // 메모리 사용 면에서 LinkedList보다 ArrayDeque가 더 효율적
        Deque<Location> queue = new ArrayDeque<>();

        boolean[][] visit = new boolean[maps.length][maps[0].length];
        // 시작점은 이미 방문한 것으로 체크
        visit[0][0] = true;

        int[][] distance = new int[maps.length][maps[0].length];
        distance[0][0] = 1;

        queue.addLast(new Location(0, 0));

        while(!queue.isEmpty()) {
            Location location = queue.removeFirst();

            int x = location.x;
            int y = location.y;

            if(x == maps.length - 1 && y == maps[0].length - 1 )
                return distance[x][y];

            for (int i = 0; i < 4; i++) {
                int nx = x + dirX[i];
                int ny = y + dirY[i];

                if (isValid(nx, ny) && !visit[nx][ny] && maps[nx][ny] == 1) {
                    visit[nx][ny] = true;
                    queue.addLast(new Location(nx, ny));
                    distance[nx][ny] = distance[x][y] + 1;
                }
            }
        }

        return -1;
    }

    public class Location{
        int x;
        int y;

        Location(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    boolean isValid(int x, int y) {
        return (x >= 0 && y >= 0 && x < maps.length && y < maps[0].length );
    }
}