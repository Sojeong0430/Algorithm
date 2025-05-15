import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        while (n>=0){
            if(n%5==0){
                result += n/5;
                System.out.println(result);
                return;
            }
            n -= 3;
            result += 1;
        }
        System.out.println(-1);
    }
}