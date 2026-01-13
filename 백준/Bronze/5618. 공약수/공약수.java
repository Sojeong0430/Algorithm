import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        int min = Integer.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        for(int i=1; i<=min; i++) {
            boolean result = false;

            for(int j=0; j<n; j++) {
                if(arr[j] % i == 0){
                    result = true;
                }else{
                    result = false;
                    break;
                }
            }

            if(result) {
                System.out.println(i);
            }
        }
    }
}