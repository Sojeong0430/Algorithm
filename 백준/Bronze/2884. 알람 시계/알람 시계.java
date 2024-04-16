import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      int H = scanner.nextInt();
      int M = scanner.nextInt();

      if (M<45){
          if(H>0){
          H = H-1;
          }
          else{
              H = 23;
          }
          M = M - 45 + 60;
      }
      else{
          M = M -45;
      }

      System.out.print(H+" ");
      System.out.print(M);

    }
}