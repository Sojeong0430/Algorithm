import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String st = br.readLine();
            HashMap<Character, Integer> hashMap = new HashMap<>();

            for (int j = 0; j < st.length(); j++) {
                Character c = st.charAt(j);
                if (hashMap.containsKey(c)) {
                    hashMap.put(c, hashMap.get(c) + 1);
                } else {
                    hashMap.put(c, 1);
                }
                hashMap.put(' ', 0);
            }

            Character frequency = ' ';
            boolean frequencyFound = false;
            for (Character c : hashMap.keySet()) {
                if (c != ' ') {
                    if (hashMap.get(c) == hashMap.get(frequency)) {
                        frequencyFound = false;
                    } else if (hashMap.get(c) > hashMap.get(frequency)) {
                        frequency = c;
                        frequencyFound = true;
                    }
                }
            }
            if (!frequencyFound) {
                sb.append("?\n");
            } else {
                sb.append(frequency).append("\n");
            }
        }
        System.out.println(sb);
    }
}