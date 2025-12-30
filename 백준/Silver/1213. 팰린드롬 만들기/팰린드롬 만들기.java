import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < st.length(); i++) {
            Character c = st.charAt(i);
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }else{
                map.put(c, 1);
            }
        }

        int oddCount = 0;
        String mid = "";
        for (char c : map.keySet()) {
            if (map.get(c) % 2 == 1) {
                oddCount++;
                mid = String.valueOf(c);
            }
        }
        if (oddCount > 1) {
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        ArrayList<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        StringBuilder left = new StringBuilder();
        for(char c : list) {
            int cnt = map.get(c) / 2;
            for (int i = 0; i < cnt; i++) {
                left.append(c);
            }
        }

        String result = left.toString() + mid + left.reverse().toString();
        System.out.println(result);
    }
}