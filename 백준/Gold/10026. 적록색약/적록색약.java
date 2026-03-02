import java.io.*;

public class Main {

    static int N;
    static char[][] arr;
    static boolean[][] visitedA;
    static boolean[][] visitedB;

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new char[N][N];
        visitedA = new boolean[N][N];
        visitedB = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for(int j = 0; j < N; j++){
                arr[i][j] = s.charAt(j);
            }
        }

        int cntA = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(arr[i][j] == 'R'&& !visitedA[i][j]){
                    dfsA(i, j, 'R');
                    cntA ++;
                } else if (arr[i][j] == 'B'&& !visitedA[i][j]) {
                    dfsA(i, j, 'B');
                    cntA ++;
                } else if (arr[i][j] == 'G'&& !visitedA[i][j]) {
                    dfsA(i, j, 'G');
                    cntA ++;
                }
            }
        }

        int cntB = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(!visitedB[i][j]){
                    dfsB(i, j);
                    cntB++;
                }
            }
        }

        System.out.print(cntA + " " + cntB);
    }

    static void dfsA(int x, int y, char c){
        visitedA[x][y] = true;

        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && nx < N && ny >= 0 && ny < N){
                if(arr[nx][ny] == c && !visitedA[nx][ny]){
                    dfsA(nx, ny, c);
                }
            }
        }
    }

    static void dfsB(int x, int y){
        visitedB[x][y] = true;

        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && nx < N && ny >= 0 && ny < N){
                if(!visitedB[nx][ny]){
                    if(arr[x][y] == 'B'){
                        if(arr[nx][ny] == 'B'){
                            dfsB(nx, ny);
                        }
                    } else {
                        if(arr[nx][ny] == 'R' || arr[nx][ny] == 'G'){
                            dfsB(nx, ny);
                        }
                    }
                }
            }
        }
    }
}