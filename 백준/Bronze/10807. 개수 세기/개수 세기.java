import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();
        String[] strNum = input.split(" ");

        int v = sc.nextInt();

        int count = 0;

        for (String num : strNum) {
            if (Integer.parseInt(num) == v) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}