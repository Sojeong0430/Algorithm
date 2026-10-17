import java.util.*;

class Solution {
    public String solution(String number, int k) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for (char c : number.toCharArray()) {
            int i = c - '0';

            if (count >= k) {
                stack.push(i);
                continue;
            }

            if (stack.isEmpty()) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && stack.peek() < i) {
                    stack.pop();
                    count += 1;
                    if (count == k) {
                        break;
                    }
                }
                stack.push(i);
            }
        }
        
        while (count < k) {
            stack.pop();
            count++;
        }

        StringBuilder sb = new StringBuilder();
        for (int c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}