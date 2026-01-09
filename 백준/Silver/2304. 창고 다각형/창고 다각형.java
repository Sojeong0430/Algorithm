import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];
        int maxHigh = -1;
        int maxLoc = -1;
        int maxIdx = -1;

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));

        for(int i = 0; i < n; i++) {
            if(arr[i][1] > maxHigh) {
                maxHigh = arr[i][1];
                maxLoc = arr[i][0];
                maxIdx = i;
            }
        }

        int result = 0;

        int leftMaxHigh = arr[0][1];
        int leftPos = arr[0][0];
        for(int i = 1; i <= maxIdx; i++) {
            result += leftMaxHigh * (arr[i][0] - leftPos);
            if(arr[i][1] > leftMaxHigh){
                leftMaxHigh = arr[i][1];
            }
            leftPos = arr[i][0];
        }

        int rightMaxHigh = arr[n - 1][1];
        int rightPos = arr[n - 1][0];
        for(int i = n - 2; i >= maxIdx; i--) {
            result += rightMaxHigh * (rightPos - arr[i][0]);
            if(arr[i][1] > rightMaxHigh){
                rightMaxHigh = arr[i][1];
            }
            rightPos = arr[i][0];
        }

        result += maxHigh;
        System.out.print(result);
    }
}
