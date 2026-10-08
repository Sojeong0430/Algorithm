import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int jobCount = jobs.length;
        
        int[][] jobList = new int[jobCount][3];
        for(int i = 0 ; i < jobCount ; i++){
            jobList[i][0] = jobs[i][0]; // 요청
            jobList[i][1] = jobs[i][1]; // 소요
            jobList[i][2] = i; // 번호
        }
        Arrays.sort(jobList, Comparator.comparingInt(a -> a[0]));
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            // 소요시간
            if(a[1] != b[1]){
                return Integer.compare(a[1], b[1]);
            }
            // 요청시간
            if(a[0] != b[0]){
                return Integer.compare(a[0], b[0]);
            }
            // 요청번호
            return Integer.compare(a[2], b[2]);
        });
        
        int time = 0;
        int index = 0;
        int[] currentJob = null;
        int currentJobStartTime;
        List<Integer> avgTime = new ArrayList<>();
        
        while(jobCount > 0){
            //  큐에 도착한 작업 담기            
            while(index < jobs.length && jobList[index][0] == time){
                pq.offer(jobList[index]);
                index ++;
            }
            
            // 진행 중인 작업 처리하기
            if(pq.size() != 0 && currentJob == null){
                currentJob = pq.poll();
            }
            
            if(currentJob != null && currentJob[1] > 0){
                currentJob[1] -= 1;
                if(currentJob[1] == 0){
                    jobCount -= 1;
                    avgTime.add(time - currentJob[0] + 1);
                    currentJob = pq.poll();
                }
            }
            time += 1;
        }
        
        int sum = 0;
        for(Integer t : avgTime){
            sum += t;
        }
        
        return sum / jobs.length;
    }
}