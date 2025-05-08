import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] bg = new int[100][100];

        for (int i = 0; i < n; i++) {
            String temp = sc.nextLine();
            int[] arr = Arrays.stream(temp.split(" ")).mapToInt(Integer::parseInt).toArray();
            for(int j = arr[0]; j < arr[0]+10; j++){
                for(int k = arr[1]; k < arr[1]+10; k++){
                    bg[j][k] = 1;
                }
            }
        }

        int count = 0 ;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (bg[i][j] == 1) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}