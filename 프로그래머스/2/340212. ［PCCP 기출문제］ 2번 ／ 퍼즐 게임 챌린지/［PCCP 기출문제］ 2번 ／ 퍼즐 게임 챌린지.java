import java.util.*;

class Solution {

    public long solution(int[] diffs, int[] times, long limit) {
        int max = 0;

        for (int diff : diffs) {
            max = Math.max(max, diff);
        }

        int left = 1;
        int right = max;

        while (left < right) {
            int mid = (right + left) / 2;
            long totalTime = times[0];

            for (int i = 1; i < diffs.length; i++) {
                int steps = diffs[i] - mid;

                if (steps > 0) {
                    totalTime += ((long) times[i] + times[i - 1]) * steps + times[i];
                } else {
                    totalTime += times[i];
                }

                if (totalTime > limit) {
                    break;
                }
            }

            if (totalTime <= limit) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}