import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = Integer.MAX_VALUE;
        boolean exist = false;

        for(int i = m ; i <= n ; i++){
            boolean isPrime = true;
            if(i == 1){
                continue;
            }
            for(int j = 2; j * j <= i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                exist = true;
                sum += i;
                if(i < min){
                    min = i;
                }
            }
        }

        if(exist){
            System.out.println(sum);
            System.out.print(min);
        }
        else{
           System.out.print(-1);
        }
    }
}