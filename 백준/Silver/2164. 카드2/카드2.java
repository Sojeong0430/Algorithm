import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if(n==1){
            System.out.println(n);
            return;
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }


        while (true) {
            queue.poll();

            int num = queue.poll();
            queue.add(num);

            if (queue.size() == 1) {
                System.out.println(queue.poll());
                break;
            }
        }

    }
}