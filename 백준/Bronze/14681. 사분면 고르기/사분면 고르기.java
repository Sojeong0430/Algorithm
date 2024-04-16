import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer =0 ;
        int numx = scanner.nextInt();
        int numy = scanner.nextInt();

        if (numx > 0 && numy > 0){
            answer = 1 ;
        } else if (numx < 0 && numy > 0) {
            answer = 2;
        } 
        else if (numx < 0 && numy < 0){
            answer = 3;
        }
        else 
            answer = 4;
        
        System.out.println(answer);
    }
}