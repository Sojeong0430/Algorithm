import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            System.out.println(running());
        }
    }

    public static int running() throws IOException{
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        HashMap<Integer, Integer> map = new HashMap<>();
        int[][] arr = new int[n][3];

        // 입력 받기
        for(int i=0; i<n; i++) {
            int h = Integer.parseInt(st.nextToken());
            map.put(h, map.getOrDefault(h, 0) + 1);
            arr[i][0] = h; // 팀
        }

        // 팀 인원 수 계산하기 + 점수 부여
        ArrayList<Integer> teamList = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i][0]) >= 6) {
                arr[i][2] = count++;
                if (!teamList.contains(arr[i][0])) {
                    teamList.add(arr[i][0]);
                }
            }
        }

        // 점수 계산하기
        int[][] scoreList = new int[teamList.size()][3];
        int teamCount = 0;

        for(Integer team : teamList) {
            ArrayList<Integer> teamScore = new ArrayList<>();
            for(int i = 0 ; i < n; i++) {
                if(arr[i][0] == team) {
                    teamScore.add(arr[i][2]);
                }
            }
            Collections.sort(teamScore);

            int sum = teamScore.get(0)
                    + teamScore.get(1)
                    + teamScore.get(2)
                    + teamScore.get(3);

            scoreList[teamCount][0] = team;
            scoreList[teamCount][1] = sum;
            scoreList[teamCount][2] = teamScore.get(4);
            teamCount++;
        }
        
        int min = Integer.MAX_VALUE;
        int winner = -1;
        int five = Integer.MAX_VALUE;

        for(int i = 0 ; i < scoreList.length; i++) {
            if(scoreList[i][1] < min) {
                winner = scoreList[i][0];
                min = scoreList[i][1];
                five = scoreList[i][2];
            } else if (scoreList[i][1] == min) {
                if(scoreList[i][2] < five) {
                    winner = scoreList[i][0];
                    five = scoreList[i][2];
                }
            }
        }
        return winner;
    }
}
