import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String NM = sc.nextLine();
        int[] arr_1 = Arrays.stream(NM.split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = arr_1[0];
        int M = arr_1[1];
        int[] basket = new int[N];

        for(int i = 0 ; i < N ; i++){
            basket[i] = i+1;
        }

        for(int i = 0 ; i < M ; i++){
            String solution = sc.nextLine();
            int[] arr_2 = Arrays.stream(solution.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] temp = new int[arr_2[1]-arr_2[0]+1];
            int index = 0;

            for(int j = arr_2[1] ; j >= arr_2[0] ; j--){
                temp[index] = basket[j-1];
                index += 1;
            }

            int index2 = arr_2[0]-1;
            for(int k = 0 ; k < temp.length ; k++){
                basket[index2] = temp[k];
                index2 += 1;
            }
        }

        for(int i = 0 ; i < N ; i++){
            System.out.print(basket[i]);
            if(i < N-1){
                System.out.print(" ");
            }
        }
    }
}