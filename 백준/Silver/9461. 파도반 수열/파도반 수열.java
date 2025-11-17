import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            long[] dp = new long[N];

            for(int j = 0; j < N; j++) {
                if(j == 0 || j == 1 || j == 2){
                    dp[j] = 1;
                }else {
                    dp[j] = dp[j-2] + dp[j-3];
                }
            }
            System.out.println(dp[N-1]);
        }
    }
}