import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1 ; i < n ; i++){
            int result = 0;
            int[] arr = Arrays.stream((String.valueOf(i)).split("")).mapToInt(Integer::parseInt).toArray();
            for(int m : arr){
                result += m;
            }
            result += i;
            if(result == n){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
        return;
    }
}