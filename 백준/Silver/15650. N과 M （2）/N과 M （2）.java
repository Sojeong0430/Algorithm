import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        boolean[] checked = new boolean[N + 1];
        int[] arr = new int[N + 1];

        class Backtrack {
            void run(int depth, int start) throws IOException {
                if (depth == M) {
                    for (int i = 0; i < M; i++) {
                        bw.write(arr[i] + " ");
                    }
                    bw.write("\n");
                    return;
                }
                for (int i = start; i <= N; i++) {
                    if (!checked[i]) {
                        checked[i] = true;
                        arr[depth] = i;
                        run(depth + 1, i + 1);
                        checked[i] = false;
                    }
                }
            }
        }

        new Backtrack().run(0, 1);
        bw.flush();
        bw.close();
        br.close();
    }
}
