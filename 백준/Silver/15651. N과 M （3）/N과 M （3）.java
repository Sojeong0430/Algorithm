import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int[] result; 
    static StringBuilder sb;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        sb = new StringBuilder();

        result = new int[m];
        backtrack(0);
        System.out.println(sb);
    }

    static void backtrack(int depth) {
        if(depth == m){ 
            for(int num : result){
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 1 ; i <= n ; i++){
            result[depth] = i;
            backtrack(depth+1);
        }
    }
}