import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[] cards = new long[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            cards[i] = Long.parseLong(st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            mergeCard(cards, n);
        }

        long result = 0;
        for (int i = 0; i < n; i++) {
            result += cards[i];
        }

        System.out.println(result);
    }

    public static void mergeCard(long[] cards, int n) {
        long first = Long.MAX_VALUE;
        long second = Long.MAX_VALUE;

        int firstIndex = -1;
        int secondIndex = -1;

        for (int i = 0; i < n; i++) {
            if (cards[i] < first) {
                second = first;
                secondIndex = firstIndex;

                first = cards[i];
                firstIndex = i;
            } else if (cards[i] < second) {
                second = cards[i];
                secondIndex = i;
            }
        }

        long sum = first + second;
        cards[firstIndex] = sum;
        cards[secondIndex] = sum;
    }
}