import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int nextNum = Integer.parseInt(st.nextToken());
            if (map.containsKey(nextNum)) {
                map.put(nextNum, map.get(nextNum) + 1);
            } else {
                map.put(nextNum, 1);
                map2.put(nextNum, i);
            }
        }

        List<Integer> result = new ArrayList<>(map.keySet());
        Collections.sort(result, (a,b) -> {

            if(map.get(a) != map.get(b)){
                return map.get(b) - map.get(a);
            }
            else{
                return map2.get(a) - map2.get(b);
            }
        });

        StringBuilder sb = new StringBuilder();
        for(Integer i : result) {
            int freq = map.get(i);
            for(int k = 0 ; k < freq ; k++){
                sb.append(i + " ");
            }
        }

        System.out.println(sb);
    }
}