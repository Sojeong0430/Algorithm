import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();

        int pointer = 0;

        for (int base = 1; base <= 30000; base++) {
            String st = String.valueOf(base);
            for (int i = 0; i < st.length(); i++) {
                if (arr[pointer] == st.charAt(i)) {
                    pointer++;
                    if (pointer == arr.length) {
                        System.out.println(base);
                        return;
                    }
                }
            }
        }
    }
}