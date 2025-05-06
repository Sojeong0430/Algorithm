import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String[] result = new String[t];

        for (int i = 0; i < t; i++) {
            String temp_result = "";
            String temp = sc.nextLine();
            String[] arr = temp.split(" ");
            for(int j = 0 ; j < arr[1].length() ; j++){
                for(int k = 0 ; k < Integer.parseInt(arr[0]) ; k++){
                    temp_result += arr[1].charAt(j);
                }
            }
            result[i] = temp_result;
        }

        for(int i = 0 ; i < t ; i++){
            System.out.println(result[i]);
        }
    }
}