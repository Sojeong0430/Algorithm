import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int I;
    static boolean[][] visited;
    static int[][] start = new int[1][2];
    static int[][] destination = new int[1][2];

    static int[] dx = {-2,-2,-1,-1,1,1,2,2};
    static int[] dy = {-1,1,-2,2,-2,2,-1,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T; t++){
            I = Integer.parseInt(br.readLine());
            visited = new boolean[I][I];
            StringTokenizer st = new StringTokenizer(br.readLine());
            start[0][0] = Integer.parseInt(st.nextToken());
            start[0][1] = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            destination[0][0] = Integer.parseInt(st.nextToken());
            destination[0][1] = Integer.parseInt(st.nextToken());

            System.out.println(bfs(start[0][0], start[0][1]));
        }
    }

    static int bfs(int sy, int sx){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{sy, sx, 0});
        visited[sy][sx] = true;

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int y = cur[0];
            int x = cur[1];
            int dist = cur[2];

            if(y == destination[0][0] && x == destination[0][1]){
                return dist;
            }

            for(int i = 0; i < 8; i++){
                int ny = y + dy[i];
                int nx = x + dx[i];

                if(nx < 0 || ny < 0 || nx >= I || ny >= I) continue;
                if(visited[ny][nx]) continue;

                visited[ny][nx] = true;
                q.add(new int[]{ny, nx, dist + 1});
            }
        }
        return -1;
    }
}