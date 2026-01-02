import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        int[][] board = new int[n][n];

        int mid = (n / 2);
        board[mid][mid] = 1;

        int number = 2;
        int direction = 4;

        int row = mid;
        int col = mid;
        int moveCount = 1;
        int moved = 0;
        int dirChanged = 0;

        int targetRow = 0;
        int targetCol = 0;

        if (k == 1) {
            targetRow = mid + 1;
            targetCol = mid + 1;
        }

        while (number <= n * n) {
            if (direction == 1) {
                col += 1;
                board[row][col] = number;
            } else if (direction == 2) {
                row += 1;
                board[row][col] = number;
            } else if (direction == 3) {
                col -= 1;
                board[row][col] = number;
            } else if (direction == 4) {
                row -= 1;
                board[row][col] = number;
            }

            if (number == k) {
                targetRow = row + 1;
                targetCol = col + 1;
            }

            number++;
            moved++;

            if (moved == moveCount) {
                moved = 0;
                dirChanged++;

                if (direction == 1) direction = 2;
                else if (direction == 2) direction = 3;
                else if (direction == 3) direction = 4;
                else if (direction == 4) direction = 1;

                if (dirChanged == 2) {
                    dirChanged = 0;
                    moveCount++;
                }
            }
        }


        StringBuilder output = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                output.append(board[i][j]).append(" ");
            }
            output.append("\n");
        }
        output.append(targetRow).append(" ").append(targetCol);

        System.out.print(output.toString());
    }
}