import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static final int MOD = 10007;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n + 1][10];

        for(int i = 0; i <= 9; i++){
            dp[1][i] = 1;
        }

        int preSum;

        for(int i = 2; i <= n; i++){
            for(int j = 0; j <= 9; j++){
                preSum = 0;
                for(int k = 0; k <= j; k++){
                    preSum += dp[i-1][j-k];
                }
                dp[i][j] = preSum % MOD;
            }
        }

        int result = 0;
        for(int i = 0; i <= 9; i++){
            result += dp[n][i];
        }

        System.out.println(result % MOD);
    }
}
