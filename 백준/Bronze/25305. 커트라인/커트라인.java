import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        String temp_score = sc.nextLine();

        int[] metaArray = Arrays.stream(temp.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] scoreArray = Arrays.stream(temp_score.split(" ")).mapToInt(Integer::parseInt).toArray();
        ArrayList<Integer> score = new ArrayList<>();
        for (int i = 0; i < metaArray[0]; i++) {
            score.add(scoreArray[i]);
        }
        Collections.sort(score, Collections.reverseOrder());

        System.out.print(score.get(metaArray[1]-1));
    }
}