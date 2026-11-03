
import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {

        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[y + 1];

        queue.add(new int[]{x, 0});
        visited[x] = true;

        while(!queue.isEmpty()) {
            int[] current = queue.poll();

            int num = current[0];
            int count = current[1];

            if(num == y) {
                return count;
            }

            int[] next = {num + n, num * 2, num * 3};

            for(int nextNum : next) {
                if(nextNum <= y && !visited[nextNum]) {
                    visited[nextNum] = true;
                    queue.add(new int[]{nextNum, count + 1});
                }
            }
        }

        return -1;
    }
}
