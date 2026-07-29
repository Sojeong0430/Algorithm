import java.util.*;

class Solution {
    boolean solution(String s) {
        
        Stack<String> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.substring(i, i + 1));
        }
        
        if(stack.size() < 2){
            return false;
        }
        
        if (stack.peek().equals("(")) {
            return false;
        }

        int count = 0;

        while (true) {

            if (stack.size() == 0) {
                break;
            }

            String current = stack.pop();

            if (current.equals(")")) {
                count++;
            } else {
                if (count == 0){
                    return false;
                }
                count--;
            }
        }

        if (count != 0) {
            return false;
        }
        if (count == 0) {
            return true;
        }

        return false;
    }
}