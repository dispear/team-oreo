
public class 게임_맵_최단거리 {
    // 상하좌우로 이동할 좌표
    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, 1, 0, -1};

    public int solution(int[][] maps) {
        int answer = 0;
        int[][] visited = new int[maps.length][maps[0].length];

        bfs(maps, visited);
        answer = visited[maps.length-1][maps[0].length-1]; //상대 팀의 좌표

        return answer==0 ? -1 : answer;
    }

    public void bfs(int[][] maps, int[][] visited){
        Queue<int[]> queue = new LinkedList<>();

        int x = 0, y = 0;
        visited[x][y] = 1;
        queue.add(new int[]{x, y});

        while(!queue.isEmpty()){
            int[] current = queue.remove();
            int cX = current[0];
            int cY = current[1];

            for(int i = 0; i < 4; i++){
                int nX = cX + dx[i];
                int nY = cY + dy[i];

                // 좌표가 map을 벗어날 경우
                if(nX < 0 || nX > maps.length-1 || nY < 0 || nY > maps[0].length-1)
                    continue;

                // 아직 방문하기 전이고, 벽이 아닐 경우
                if(visited[nX][nY] == 0 && maps[nX][nY] == 1){
                    visited[nX][nY] = visited[cX][cY] + 1;
                    queue.add(new int[]{nX, nY});
                }
            }

        }


    }
}