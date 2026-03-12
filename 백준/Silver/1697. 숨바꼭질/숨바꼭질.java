import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int N, K;
    static boolean[] visited = new boolean[100001];
    static int[] time = new int[100001];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        bfs();

        System.out.println(time[K]);
    }

    static void bfs(){

        Queue<Integer> q = new LinkedList<Integer>();

        q.add(N);
        visited[N] = true;

        while(!q.isEmpty()){

            int cur = q.poll();

            if(cur == K) return;

            int[] next = {cur -1, cur + 1, cur * 2};

            for(int i : next){

                if(i >= 0 && i <= 100000 && !visited[i]){
                    visited[i] = true;
                    time[i] = time[cur] + 1;
                    q.add(i);
                }
            }
        }
    }
}