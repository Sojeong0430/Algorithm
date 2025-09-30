import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static boolean[] visited; // 방문 여부를 기록하는 배열
    static int[] result; // 선택한 숫자를 저장하는 배열
    static StringBuilder sb;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        sb = new StringBuilder();

        visited = new boolean[n + 1];
        result = new int[m];
        backtrack(0,1);
        System.out.println(sb);
    }

    static void backtrack(int depth, int start) {
        if(depth == m){ // M개가 선택 되었다면 재귀를 멈추고 출력
            for(int num : result){
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = start ; i <= n ; i++){
            result[depth] = i;
            backtrack(depth+1, i+1); // 현재 선택된 수보다 큰 값부터
        }
    }
} 