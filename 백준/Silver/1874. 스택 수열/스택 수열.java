import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        List<Character> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int pointer = 1;

        for(int i = 0; i < n; i++) {

            if(arr[i] >= pointer) {
                while(pointer <= arr[i]){
                    stack.push(pointer);
                    pointer++;
                    result.add('+');
                }
            }

            if(stack.isEmpty() || stack.peek()!= arr[i]) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            result.add('-');
        }

        for(Character c : result) {
            System.out.println(c);
        }
    }
}