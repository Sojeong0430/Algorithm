import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            int K = Integer.parseInt(br.readLine());
            int[] result = game(s,K);

            if(result[0] == -1 || result[1] == -1){
                sb.append("-1" + '\n');
            }else{
                sb.append(result[0] + " " + result[1] + '\n');
            }
        }
        System.out.println(sb);
    }

    public static int[] game(String s, int K){
        int min = Integer.MAX_VALUE;
        int max = -1;

        ArrayList<Integer>[] pos = new ArrayList[26];
        for(int i = 0; i < 26; i++){
            pos[i] = new ArrayList<>();
        }

        for(int i = 0; i < s.length(); i++){
            pos[s.charAt(i) - 'a'].add(i);
        }

        for(int i = 0; i < 26; i++){
            if(pos[i].size() < K) continue;

            for(int j = 0; j <= pos[i].size() - K; j++){
                int length = pos[i].get(j + K - 1) - pos[i].get(j) + 1;
                min = Math.min(min, length);
                max = Math.max(max, length);
            }
        }

        if(max == -1) return new int[]{-1, -1};
        return new int[]{min, max};
    }
}