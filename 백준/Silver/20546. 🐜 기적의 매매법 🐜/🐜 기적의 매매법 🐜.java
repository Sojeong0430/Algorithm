import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(br.readLine());

        int[] tick = new int[14];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 14; i++) {
            tick[i] = Integer.parseInt(st.nextToken());
        }

        int junHyeon = junHyeon(money, tick);
        int sungMin = sungMin(money, tick);

        if(junHyeon > sungMin) {
            System.out.println("BNP");
        }else if(junHyeon < sungMin) {
            System.out.println("TIMING");
        } else if (junHyeon == sungMin) {
            System.out.println("SAMESAME");
        }

    }

    public static int junHyeon(int money, int[] tick) {
        int haveMoney = money;
        int haveStock = 0;

        for(int i = 0; i < 14; i++) {
            if(haveMoney >= tick[i]) {
                int canBuying = haveMoney / tick[i];
                haveStock += canBuying;
                haveMoney -= canBuying * tick[i];
            }
        }
        return calculate(tick[13], haveMoney, haveStock);
    }

    public static int sungMin(int money, int[] tick) {
        int haveMoney = money;
        int haveStock = 0;
        int status = 2;
        int statusCount = 0;

        for (int i = 1; i < 14; i++) {

            if (tick[i - 1] > tick[i]) {
                if (status == 0) {
                    statusCount++;
                } else {
                    status = 0;
                    statusCount = 1;
                }

                if (statusCount == 3) {
                    int canBuy = haveMoney / tick[i];
                    haveStock += canBuy;
                    haveMoney -= canBuy * tick[i];
                }
            }
            else if (tick[i - 1] < tick[i]) {
                if (status == 1) {
                    statusCount++;
                } else {
                    status = 1;
                    statusCount = 1;
                }

                if (statusCount == 3) {
                    haveMoney += haveStock * tick[i];
                    haveStock = 0;
                }
            }
            else {
                status = 2;
                statusCount = 0;
            }
        }

        return calculate(tick[13], haveMoney, haveStock);
    }

    public static int calculate(int tick, int haveMoney, int haveStock) {
        return (haveStock * tick) + haveMoney;
    }
}