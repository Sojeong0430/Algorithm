import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int N, M, K;
    static boolean[][] visited;
    static int[][] arr;

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        visited = new boolean[N][M];

        for(int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            arr[r-1][c-1] = 1;
        }

        int max = 0;

        for(int r = 0; r < N; r++) {
            for(int c = 0; c < M; c++) {
                if(!visited[r][c] && arr[r][c] == 1) {
                    int current = dfs(r, c);
                    if(current > max) {
                        max = current;
                    }
                }
            }
        }

        System.out.println(max);
    }

    static int dfs(int y, int x){
        visited[y][x] = true;
        int count = 1;

        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && nx < M && ny >= 0 && ny < N){
                if(arr[ny][nx] == 1 && !visited[ny][nx]){
                    count += dfs(ny, nx);
                }
            }
        }

        return count;
    }
}