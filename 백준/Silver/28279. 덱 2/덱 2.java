import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    static Deque<Integer> dq = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            process(st);
        }
    }

    private static void process(StringTokenizer st) {
        int count = st.countTokens();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int num = arr[0];

        if(num == 1){
            dq.addFirst(arr[1]);
        } else if (num == 2){
            dq.addLast(arr[1]);
        } else if (num == 3){
            if(!dq.isEmpty()){
                System.out.println(dq.pollFirst());
            }else{
                System.out.println(-1);
            }
        } else if(num == 4){
            if(!dq.isEmpty()){
                System.out.println(dq.pollLast());
            }else{
                System.out.println(-1);
            }
        } else if(num == 5){
            System.out.println(dq.size());
        } else if(num == 6){
            if(dq.isEmpty()){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        } else if(num == 7){
            if(!dq.isEmpty()){
                System.out.println(dq.peekFirst());
            }else{
                System.out.println(-1);
            }
        } else if(num == 8){
            if(!dq.isEmpty()){
                System.out.println(dq.peekLast());
            }else{
                System.out.println(-1);
            }
        }
    }
}