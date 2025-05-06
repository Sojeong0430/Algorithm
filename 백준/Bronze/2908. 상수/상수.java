import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reversed = new StringBuilder(s).reverse().toString();
        int[] arr = Arrays.stream(reversed.split(" ")).mapToInt(Integer::parseInt).toArray();
        if(arr[0]>arr[1]){
            System.out.println(arr[0]);
        }else if(arr[1]>arr[0]){
            System.out.println(arr[1]);
        }
    }
}