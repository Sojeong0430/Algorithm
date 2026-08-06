import java.util.*;

class Solution {

    static int max = 0;
    static boolean[] visited;
    static int[][] dungeons;

    public int solution(int k, int[][] dungeons) {
        this.dungeons = dungeons;
        visited = new boolean[dungeons.length];

        dfs(k, 0);

        return max;
    }

    private void dfs(int k, int count) {
        max = Math.max(max, count);

        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;

                dfs(k - dungeons[i][1], count + 1);

                visited[i] = false;
            }
        }
    }
}