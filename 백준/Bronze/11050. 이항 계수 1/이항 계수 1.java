import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(factorial(N)/(factorial(K)*factorial(N-K)));
    }

    public static int factorial(int num){
        if(num == 1 || num == 0){
            return 1;
        }else{
            return num * factorial(num - 1);
        }
    }
}