class Solution {
    public int solution(int[] num_list) {
        int answer = 0;

        String even = "";
        String add = "";

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even += Integer.toString(num_list[i]);
            } else {
                add += Integer.toString(num_list[i]);
            }
        }

        answer += Integer.parseInt(even) + Integer.parseInt(add);
        return answer;
    }
}
