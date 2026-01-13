import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while(true){
            if(isPel(n)){
                if(isSo(n)){
                    System.out.print(n);
                    break;
                }else{
                    n += 1;
                }
            }else{
                n += 1;
            }
        }
    }

    static boolean isPel (int n){
        Stack<Character> stack = new Stack<>();
        String s = String.valueOf(n);

        for(int i = 0; i < s.length() / 2; i++){
            stack.push(s.charAt(i));
        }
        int start = (s.length() % 2 == 0)
                ? s.length() / 2
                : s.length() / 2 + 1;

        for(int i = start; i < s.length(); i++){
            if(!stack.pop().equals(s.charAt(i))){
                return false;
            }
        }
        return true;
    }

    static boolean isSo(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i * i <= n ; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}