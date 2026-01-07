import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        String s;
        int count = 0;

        while((s = br.readLine()) != null && s.length() != 0) {
            map.put(s, map.getOrDefault(s, 0) + 1);
            count++;
        }

        List<String> trees = new ArrayList<>(map.keySet());
        Collections.sort(trees);

        StringBuilder sb = new StringBuilder();
        for(String tree : trees) {
            double ratio = (map.get(tree) * 100.0) / count;
            sb.append(String.format("%s %.4f\n", tree, ratio));
        }

        System.out.println(sb.toString());
    }
}