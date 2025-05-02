import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String NM = sc.nextLine();
        String[] arr_1 = NM.split(" ");
        int N = Integer.parseInt(arr_1[0]);
        int M = Integer.parseInt(arr_1[1]);

        int[] basket = new int[N]; 
        for(int i = 0 ; i < M ; i++){
            String temp  = sc.nextLine();
            int[] solutions = Arrays.stream(temp.split(" ")).mapToInt(Integer::parseInt).toArray();
            for(int j = solutions[0]-1 ; j < solutions[1] ; j++){
                basket[j] = solutions[2];
            }
        }
        for(int i = 0 ; i < N-1 ; i++){
            System.out.print(basket[i] + " ");
        }
        System.out.println(basket[N-1]);
    }
}