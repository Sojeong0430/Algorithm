import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        StringTokenizer st;
        HashMap<Integer, Integer> cow = new HashMap<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int way = Integer.parseInt(st.nextToken());
            if(cow.containsKey(num)) {
                if(cow.get(num) != way) {
                    cow.put(num, way);
                    count +=1;
                }
            }else{
                cow.put(num, way);
            }
        }
        System.out.println(count);
    }
}