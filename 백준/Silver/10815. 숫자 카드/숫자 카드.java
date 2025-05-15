import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String temp = br.readLine();
        int[] cards_temp = Arrays.stream(temp.split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> cards = new ArrayList<>();
        for(int k : cards_temp){
            cards.add(k);
        }
        Collections.sort(cards);

        int m = Integer.parseInt(br.readLine());
        temp = br.readLine();
        int[] comparisons = Arrays.stream(temp.split(" ")).mapToInt(Integer::parseInt).toArray();

        List<Integer> result = new ArrayList<>();

        for(int k : comparisons){
            int high = cards.size()-1;
            int low = 0;
            int mid;
            int status=0;
            while(high >= low){
                mid = (high+low)/2;
                if(cards.get(mid) == k){
                    status = 1;
                    break;
                }else{
                    if(cards.get(mid) > k){
                        high = mid - 1;
                    }else if(cards.get(mid) < k){
                        low = mid + 1;
                    }
                }
            }
            if(status==1){
                result.add(1);
            }else{
                result.add(0);
            }
        }
        for(int i = 0 ; i < result.size(); i++){
            System.out.print(result.get(i));
            if(i != result.size()-1){
                System.out.print(" ");
            }
        }
    }
}