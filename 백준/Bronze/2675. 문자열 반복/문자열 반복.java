import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0 ; i < n ; i++){
            int r = sc.nextInt();
            String s = sc.next();
            String result = "";
            for(int k = 0 ; k < s.length() ; k++){
                for(int j = 0 ; j < r ; j++){
                    result += s.charAt(k);
                }
            }
            System.out.println(result);
        }
    }
}