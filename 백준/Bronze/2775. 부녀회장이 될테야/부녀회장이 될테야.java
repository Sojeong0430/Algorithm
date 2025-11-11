import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int k;
        int n;

        for(int i = 0; i < t; i++){
            k = sc.nextInt();
            n = sc.nextInt();
            System.out.println(getPeople(k,n));
        }
    }

    public static int getPeople(int k, int n){
        int[][] people = new int[k+1][n+1];
        for(int i = 1; i <= n ; i++){
            people[0][i] = i;
        }

        for(int i = 1; i <= k ; i++){
            for(int j = 1; j <= n ; j++){
                people[i][j] = people[i-1][j] + people[i][j-1];
            }
        }
        return people[k][n];
    }
}