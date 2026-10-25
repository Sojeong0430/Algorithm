import java.util.*;

class Solution {
    public int solution(String dirs) {
        int count = 0;
        int currentX = 0;
        int currentY = 0;
        Set<String> visited = new HashSet<>();

        for (char c : dirs.toCharArray()) {
            int nextX = currentX;
            int nextY = currentY;

            if (c == 'U') {
                nextY++;
            } else if (c == 'D') {
                nextY--;
            } else if (c == 'L') {
                nextX--;
            } else if (c == 'R') {
                nextX++;
            }

            if (nextX < -5 || nextX > 5 ||
                nextY < -5 || nextY > 5) {
                continue;
            }

            String path1 = currentX + "," + currentY + "," + nextX + "," + nextY;
            String path2 = nextX + "," + nextY + "," + currentX + "," + currentY;

            if (!visited.contains(path1) && !visited.contains(path2)) {
                count++;
                visited.add(path1);
                visited.add(path2);
            }

            currentX = nextX;
            currentY = nextY;
        }

        return count;
    }
}