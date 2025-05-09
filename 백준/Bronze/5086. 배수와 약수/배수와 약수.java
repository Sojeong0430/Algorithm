import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> result = new ArrayList<>();
        
        while (true){
            String temp = sc.nextLine();
            if(temp.equals("0 0")){
                break;
            }
            int[] arr = Arrays.stream(temp.split(" ")).mapToInt(Integer::parseInt).toArray();
            if(arr[1]%arr[0]==0){
                result.add("factor");
            }else if(arr[0]%arr[1]==0){
                result.add("multiple");
            }else{
                result.add("neither");
            }
        }
        
        for(String s : result){
            System.out.println(s);
        }
    }
}