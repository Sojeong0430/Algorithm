import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int M, N, K;
    static int[][] arr;
    static boolean[][] visited;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++){
            int cnt = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            arr = new int[N][M];
            visited = new boolean[N][M];

            for(int j = 0; j < K ; j++){
                st = new StringTokenizer(br.readLine());
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());
                arr[Y][X] = 1;
            }

            for(int j = 0; j < N ; j++){
                for(int k = 0; k < M ; k++){
                    if(!visited[j][k] && arr[j][k] == 1){
                        dfs(k,j);
                        cnt +=1;
                    }
                }
            }
            System.out.println(cnt);
        }
    }

    static void dfs(int x, int y) {
        visited[y][x] = true;

        for(int i = 0 ; i < 4 ; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && nx < M && ny >= 0 && ny < N
                && arr[ny][nx] == 1 && !visited[ny][nx]){
                dfs(nx,ny);
            }
        }
    }
}