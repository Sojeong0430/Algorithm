import java.io.*;

public class Main {

    static int A, T, D;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        A = Integer.parseInt(br.readLine());
        T = Integer.parseInt(br.readLine());
        D = Integer.parseInt(br.readLine());

        int count0 = 0;
        int count1 = 0;
        int round = 1;
        int turn = 0;

        while (true) {

            if (say(0, ++turn, ++count0)) break;
            if (say(1, ++turn, ++count1)) break;
            if (say(0, ++turn, ++count0)) break;
            if (say(1, ++turn, ++count1)) break;

            for (int i = 0; i < round + 1; i++) {
                if (say(0, ++turn, ++count0)) {
                    System.out.println((turn - 1) % A);
                    return;
                }
            }

            for (int i = 0; i < round + 1; i++) {
                if (say(1, ++turn, ++count1)) {
                    System.out.println((turn - 1) % A);
                    return;
                }
            }

            round++;
        }

        System.out.println((turn - 1) % A);
    }

    static boolean say(int type, int turn, int count) {
        return type == D && count == T;
    }
}