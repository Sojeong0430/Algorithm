import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Math.min;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] price = new int[n][3];
        int[][] dp = new int[n][3]; // 1:red 2:green 3:blue

        for(int i = 0 ; i < n ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            price[i][0] = Integer.parseInt(st.nextToken()); // red
            price[i][1] = Integer.parseInt(st.nextToken()); // green
            price[i][2] = Integer.parseInt(st.nextToken()); // blue
        }

        dp[0][0] = price[0][0];
        dp[0][1] = price[0][1];
        dp[0][2] = price[0][2];

        for(int i = 1 ; i < n ; i++){
            dp[i][0] = price[i][0] + min(dp[i-1][1], dp[i-1][2]);
            dp[i][1] = price[i][1] + min(dp[i-1][0], dp[i-1][2]);
            dp[i][2] = price[i][2] + min(dp[i-1][1], dp[i-1][0]);
        }

        int answer = min(dp[n-1][0], min(dp[n-1][1], dp[n-1][2]));
        System.out.println(answer);
    }
}