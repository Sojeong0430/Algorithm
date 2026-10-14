import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int sum = brown + yellow;

        for (int width = 1; width <= sum; width++) {
            if (sum % width != 0) {
                continue;
            } else {
                int length = sum / width;

                int outLineCount = (width * 2) + (length * 2) - 4;

                if (outLineCount == sum) {
                    continue;
                } else {
                    if (yellow == sum - outLineCount) {
                        if(width >= length){
                            return new int[]{width, length};
                        }else{
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }

        return new int[]{0, 0};
    }
}