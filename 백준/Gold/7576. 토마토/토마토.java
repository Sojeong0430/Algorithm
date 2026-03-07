import java.io.*;
import java.util.*;

public class Main {

    static int N, M;
    static int[][] arr;
    static Queue<int[]> q = new LinkedList<>();

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        arr = new int[N][M];

        for (int i = 0; i < N; i++) {

            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());

                if(arr[i][j] == 1) {
                    q.add(new int[]{i, j});
                }
            }
        }

        bfs();

        int result = 0;

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {

                if(arr[i][j] == 0) {
                    System.out.print(-1);
                    return;
                }

                result = Math.max(result, arr[i][j]);
            }
        }

        System.out.println(result -1);
    }

    static void bfs() {

        while(!q.isEmpty()) {

            int[] cur = q.poll();

            int y = cur[0];
            int x = cur[1];

            for(int i = 0; i < 4; i++) {

                int ny = y + dy[i];
                int nx = x + dx[i];

                if(ny >= 0 && ny < N && nx >= 0 && nx < M) {
                    if(arr[ny][nx] == 0) {

                        arr[ny][nx] = arr[y][x] + 1;
                        q.offer(new int[]{ny, nx});
                    }
                }
            }
        }
    }
}