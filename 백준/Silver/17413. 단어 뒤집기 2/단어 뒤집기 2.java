import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Character> stack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();

        StringBuilder sb = new StringBuilder();
         int pointer = 0;

         while(pointer < st.length()){
             char c = st.charAt(pointer);

             if(c == '<'){
                 while(!stack.isEmpty()){
                     sb.append(stack.pop());
                 }
                 while(st.charAt(pointer) != '>'){
                     sb.append(st.charAt(pointer));
                     pointer++;
                 }
                 sb.append(st.charAt(pointer));
                 pointer++;
             }

             else if(c == ' '){
                 while(!stack.isEmpty()){
                     sb.append(stack.pop());
                 }
                 sb.append(st.charAt(pointer));
                 pointer++;
             }

             else{
                 stack.push(c);
                 pointer++;
             }
         }

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
         System.out.println(sb);
    }
}