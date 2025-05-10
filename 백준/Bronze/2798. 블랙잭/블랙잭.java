import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String temp = sc.nextLine();
        int[] arr = Arrays.stream(temp.split(" ")).mapToInt(Integer::parseInt).toArray();
        temp = sc.nextLine();
        int[] cards = Arrays.stream(temp.split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> result = new ArrayList<>();

        for(int card1 = cards.length-1 ; card1 >= 0 ; card1--){
            for(int card2 = card1-1 ; card2 >= 0 ; card2--){
                for(int card3 = card2-1 ; card3 >= 0 ; card3--){
                    if(cards[card1] + cards[card2] + cards[card3] <= arr[1]){
                        result.add(cards[card1] + cards[card2] + cards[card3]);
                    }
                }
            }
        }
        result.sort(Collections.reverseOrder());
        System.out.print(result.get(0));
    }
}