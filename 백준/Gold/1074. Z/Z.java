import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int N, r, c;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        System.out.println(search(N, r, c));
    }

    static int search(int n, int r, int c) {

        if(n == 0) return 0;

        int half = 1 << (n - 1);
        int area = half * half;

        if(r < half && c < half) {
            return search(n - 1, r, c);
        }
        else if(r < half && c >= half) {
            return area + search(n - 1, r, c - half);
        }
        else if(r >= half && c < half) {
            return area * 2 + search(n - 1, r - half, c);
        }
        else {
            return area * 3 + search(n - 1, r - half, c - half);
        }
    }
}