import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] result = new int[n];
        Arrays.fill(result, -1);

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int tall = 0 ; tall < n ; tall++){
            int leftCount = Integer.parseInt(st.nextToken());

            int count = 0;
            for(int i = 0 ; i < n ; i++){
                if(result[i] == -1){
                    if(count == leftCount){
                        result[i] = tall + 1;
                        break;
                    }else{
                        count++;
                    }
                }
            }
        }

        for(int i = 0 ; i < n ; i++){
            System.out.print(result[i] + " ");
        }
    }
}