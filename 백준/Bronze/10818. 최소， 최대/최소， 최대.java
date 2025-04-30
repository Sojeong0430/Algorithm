import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] result = new int[2];

        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        int[] arr2 = new int[arr.length];

        for (int i = 0; i < n; i++) {
            arr2[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(arr2);
        result[0] = arr2[0];
        result[1] = arr2[arr2.length - 1];

        String answer = "";
        for (int i = 0; i < 2; i++) {
            answer += result[i] + " ";
        }
        System.out.println(answer);
    }
}
