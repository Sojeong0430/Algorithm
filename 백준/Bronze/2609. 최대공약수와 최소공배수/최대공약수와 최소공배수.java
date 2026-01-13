import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int min = (n > m) ? m : n;
        int max = (n > m) ? n : m;

        for(int i = min ; i > 0 ; i--){
            boolean result = false;

            if(m % i == 0 && n % i == 0){
                result = true;
            }else{
                result = false;
            }

            if(result){
                System.out.println(i);
                break;
            }
        }

        int first = max;
        while(true){
            if(first % min == 0 && first % max == 0){
                System.out.println(first);
                break;
            }else{
                first += max;
            }
        }
    }
}