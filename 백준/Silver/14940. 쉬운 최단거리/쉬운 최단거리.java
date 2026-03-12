import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static int[][] arr;
    static int[][] dist;
    static boolean[][] visited;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int startY, startX;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        dist = new int[N][M];
        visited = new boolean[N][M];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());

                if(arr[i][j] == 2){
                    startY = i;
                    startX = j;
                }
            }
        }

        bfs();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){

                if(arr[i][j] == 0){
                    sb.append(0).append(" ");
                }
                else if(!visited[i][j]){
                    sb.append(-1).append(" ");
                }
                else{
                    sb.append(dist[i][j]).append(" ");
                }

            }
            sb.append("\n");
        }

        System.out.print(sb);
    }

    static void bfs(){

        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{startY, startX});
        visited[startY][startX] = true;

        while(!q.isEmpty()){

            int[] cur = q.poll();
            int y = cur[0];
            int x = cur[1];

            for(int k = 0; k < 4; k++){

                int ny = y + dy[k];
                int nx = x + dx[k];

                if(ny >= 0 && ny < N && nx >= 0 && nx < M){

                    if(!visited[ny][nx] && arr[ny][nx] == 1){

                        visited[ny][nx] = true;
                        dist[ny][nx] = dist[y][x] + 1;
                        q.add(new int[]{ny, nx});

                    }
                }
            }
        }
    }
}