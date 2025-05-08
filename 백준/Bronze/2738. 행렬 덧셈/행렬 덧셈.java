import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String temp = sc.nextLine();
       int[] arr = Arrays.stream(temp.split(" ")).mapToInt(Integer::parseInt).toArray();

       int[][] A = new int[arr[0]][arr[1]];
       int[][] B = new int[arr[0]][arr[1]];

       for(int i = 0; i < arr[0]; i++) {
           String s = sc.nextLine();
           int[] arr1 = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
           A[i] = arr1;
       }

        for(int i = 0; i < arr[0]; i++) {
            String s = sc.nextLine();
            int[] arr1 = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
            B[i] = arr1;
        }

        for(int i = 0; i < arr[0]; i++) {
            for(int j = 0; j < arr[1]; j++) {
                A[i][j] += B[i][j];
            }
        }

        for(int i = 0; i < arr[0]; i++) {
            for(int j = 0; j < arr[1]; j++) {
                System.out.print(A[i][j]);
                if(j < arr[1] - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}