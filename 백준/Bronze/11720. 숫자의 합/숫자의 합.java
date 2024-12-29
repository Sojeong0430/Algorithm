import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String nums = sc.next();
        int sum = 0 ;

        for (int i = 0 ; i < nums.length() ; i++){
            sum += Character.getNumericValue(nums.charAt(i));
        }
        System.out.println(sum);
    }
}