import java.util.*;

class Solution {

    static int n, m;
    static boolean[][] visited;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};

    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;
        visited = new boolean[n][m];

        return bfs(maps);
    }

    static int bfs(int[][] maps) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0,0,1}); // x, y, 거리
        visited[0][0] = true;

        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            int dist = cur[2];

            if(x == n-1 && y == m-1) {
                return dist;
            }

            for(int k=0;k<4;k++){
                int nx = x + dx[k];
                int ny = y + dy[k];

                if(nx>=0 && nx<n && ny>=0 && ny<m){
                    if(!visited[nx][ny] && maps[nx][ny]==1){
                        visited[nx][ny] = true;
                        q.offer(new int[]{nx, ny, dist+1});
                    }
                }
            }
        }

        return -1; // 도달 불가
    }
}