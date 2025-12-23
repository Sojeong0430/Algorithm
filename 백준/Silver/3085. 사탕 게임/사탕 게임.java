import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if(j<n-1){
                    swap(board, i, j, i, j+1);
                    max = Math.max(calculateMaxCandies(board, n), max);
                    swap(board, i, j+1, i, j);
                }

                if(i<n-1){
                    swap(board, i, j, i+1, j);
                    max = Math.max(calculateMaxCandies(board, n), max);
                    swap(board, i+1, j, i, j);
                }
            }
        }
        System.out.println(max);
    }

    private static void swap(char[][] board, int x1, int y1, int x2, int y2) {
        char temp = board[x1][y1];
        board[x1][y1] = board[x2][y2];
        board[x2][y2] = temp;
    }

    private static int calculateMaxCandies(char[][] board, int n) {
        int max = 0;

        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = 1; j < n; j++) {
                if(board[i][j] == board[i][j-1]){
                    count++;
                }else{
                    if(count > max){
                        max = count;
                    }
                    count = 1;
                }
            }
            max = Math.max(max, count);
        }

        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = 1; j < n; j++) {
                if(board[j][i] == board[j-1][i]){
                    count++;
                }else{
                    if(count > max){
                        max = count;
                    }
                    count = 1;
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }
}