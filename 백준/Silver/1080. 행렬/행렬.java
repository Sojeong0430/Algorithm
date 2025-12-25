import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] first = new int[n+1][m+1];
        for(int i = 1; i <= n; i++){
            String s = br.readLine();
            for(int j = 1; j <= m; j++){
                char c = s.charAt(j-1);
                first[i][j] = Integer.parseInt(String.valueOf(c));
            }
        }

        int[][] second = new int[n+1][m+1];
        for(int i = 1; i <= n; i++){
            String s = br.readLine();
            for(int j = 1; j <= m; j++){
                char c = s.charAt(j-1);
                second[i][j] = Integer.parseInt(String.valueOf(c));
            }
        }

        int result = 0;

        for(int i = 1; i <= n-2; i++){
            for(int j = 1; j <= m-2; j++){
                if(first[i][j] != second[i][j]){
                    changing(first, i, j);
                    result += 1;
                }
            }
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(first[i][j] != second[i][j]){
                    System.out.println(-1);
                    return;
                }
            }
        }

        System.out.println(result);
    }

    public static void changing(int[][] first, int x, int y){
        for(int i = x; i <= x+2; i++){
            for(int j = y; j <= y+2; j++){
                if(first[i][j] == 1){
                    first[i][j] = 0;
                } else if(first[i][j] == 0){
                    first[i][j] = 1;
                }
            }
        }
    }
}