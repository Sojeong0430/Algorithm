import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] nums = {
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken())
        };

        int count = 1;

        while (nums[1] > nums[0]) {
            if(nums[1] % 2 == 0){
                nums[1] = nums[1] / 2;
                count++;
            } else if (nums[1] % 10 == 1) {
                nums[1] = nums[1] /= 10;
                count++;
            } else{
                break;
            }
        }

        if(nums[1] == nums[0]){
            System.out.println(count);
        } else {
            System.out.println(-1);
        }
    }
}