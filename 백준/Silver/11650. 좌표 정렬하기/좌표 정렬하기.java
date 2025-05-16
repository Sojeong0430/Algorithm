import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] arr = new int[n][2];

        for(int i = 0; i < n; i++) {
            int[] temp =  Arrays.stream(sc.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            arr[i][0] = temp[0];
            arr[i][1] = temp[1];
        }

        Arrays.sort(arr, (a,b) -> { 
            if(a[0] != b[0]){ // 첫 번째 기준
                return Integer.compare(a[0], b[0]);
            }else{ // 두 번째 기준
                return Integer.compare(a[1], b[1]);
            }
        });

        for(int[] m : arr){
            System.out.println(m[0] + " " + m[1]);
        }
    }
}