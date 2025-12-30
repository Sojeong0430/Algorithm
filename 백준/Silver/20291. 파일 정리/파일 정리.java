import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            String file = br.readLine();
            for(int j=0;j<file.length();j++){
                if(file.charAt(j) == '.'){
                    String s = file.substring(j+1,file.length());
                    if(map.containsKey(s)){
                        map.put(s,map.get(s)+1);
                    }else{
                        map.put(s,1);
                    }
                }
            }
        }

        ArrayList<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for(String s : list){
            sb.append(s + ' ' + map.get(s) + '\n');
        }

        System.out.println(sb);
    }
}