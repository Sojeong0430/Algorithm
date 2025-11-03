import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] numbers;
    static int[] ops = new int[4]; // + - * /
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        numbers = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            ops[i] = Integer.parseInt(st.nextToken());
        }

        dfs(1, numbers[0]);

        System.out.println(max);
        System.out.println(min);
    }

    static void dfs(int index, int value){
        if(index == N){
            max = Math.max(max, value);
            min = Math.min(min, value);
            return;
        }

        for(int i = 0; i < 4; i++){
            if(ops[i] > 0){
                ops[i]--;
                int nextValue = 0;

                switch (i){
                    case 0:
                        nextValue = value + numbers[index];
                        break;
                    case 1:
                        nextValue = value - numbers[index];
                        break;
                    case 2:
                        nextValue = value * numbers[index];
                        break;
                    case 3:
                        if (value < 0)
                            nextValue = -(-value / numbers[index]);
                        else
                            nextValue = value / numbers[index];
                        break;
                }
                dfs(index + 1, nextValue);
                ops[i]++;
            }
        }
    }
}