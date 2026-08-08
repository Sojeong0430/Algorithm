import java.util.*;

class Solution {

    static HashMap<String, Integer> map = new HashMap<>() {{
        put("zero", 0);
        put("one", 1);
        put("two", 2);
        put("three", 3);
        put("four", 4);
        put("five", 5);
        put("six", 6);
        put("seven", 7);
        put("eight", 8);
        put("nine", 9);
    }};

    public int solution(String s) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char current = chars[i];

            if (Character.isDigit(current)) {
                sb1.append(current);
            } else {
                sb2.append(current);

                if (map.containsKey(sb2.toString())) {
                    sb1.append(map.get(sb2.toString()));
                    sb2 = new StringBuilder();
                }
            }
        }

        return Integer.parseInt(sb1.toString());
    }
}