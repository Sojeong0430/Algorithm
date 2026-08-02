import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> genresCount = new HashMap<>();
        HashMap<String, List<Integer>> musicSortCount = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            genresCount.put(genres[i],
                    genresCount.getOrDefault(genres[i], 0) + plays[i]);

            List<Integer> list = musicSortCount.getOrDefault(genres[i], new ArrayList<>());
            list.add(i);
            musicSortCount.put(genres[i], list);
        }
        
        List<Map.Entry<String, Integer>> genresCountList = new ArrayList<>(genresCount.entrySet());
        genresCountList.sort((a, b) -> b.getValue() - a.getValue());
        
        for (List<Integer> songs : musicSortCount.values()) {
            songs.sort((a, b) -> {
                if (plays[a] == plays[b]) {
                    return a - b;
                }
                return plays[b] - plays[a];
            });
        }
        
        List<Integer> answer = new ArrayList<>();
        
        for(Map.Entry<String, Integer> entry : genresCountList){
            String genre = entry.getKey();
            List<Integer> songList = musicSortCount.get(genre);
            
            answer.add(songList.get(0));
            
            if(songList.size() > 1){
                answer.add(songList.get(1));
            }
        }

        int[] result = new int[answer.size()];
        
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        
        return result;
    }
}