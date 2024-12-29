import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0 ;
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0 ; i < n ; i++){
            arr[i] = scanner.nextInt();
        }

        int b = scanner.nextInt();

        for(int i = 0 ; i < arr.length ; i++){
            if(b==arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}