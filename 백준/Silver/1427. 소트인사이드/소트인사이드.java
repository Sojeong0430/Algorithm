import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        int[] temp = Arrays.stream(n.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        Integer[] tempBoxed = Arrays.stream(temp)
                .boxed()
                .toArray(Integer[]::new);

        Arrays.sort(tempBoxed, Collections.reverseOrder());

        for(int i = 0; i < tempBoxed.length; i++) {
            System.out.print(tempBoxed[i]);
        }
    }
}