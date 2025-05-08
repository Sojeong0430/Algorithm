import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] data = new String[5][15];

        for (int i = 0; i < 5; i++) {
            String[] temp = sc.nextLine().split("");
            for (int j = 0; j < temp.length ; j++) {
                data[i][j] = temp[j];
            }
        }

        String result = "";
        for(int i = 0; i < 15; i++) {
            for(int j = 0; j < 5; j++) {
                if(data[j][i]!=null) {
                    result += data[j][i];
                }
            }
        }
        System.out.println(result);
    }
}