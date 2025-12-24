import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] prices = new int[n];
            for (int j = 0; j < n; j++) {
                prices[j] = Integer.parseInt(st.nextToken());
            }
            System.out.println(calculateProfit(prices));
        }
    }

    public static long calculateProfit(int[] prices){
        long result = 0;
        long max = 0;

        for(int i = prices.length - 1; i >= 0; i--){
            if(prices[i] > max){
                max = prices[i];
            } else{
                result += max - prices[i];
            }
        }

        return result;
    }
}