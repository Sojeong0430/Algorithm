import java.util.*;

class Solution {
    String[][] tickets;
    List<String[]> routeList = new ArrayList<>();
    List<String[]> usedList = new ArrayList<>();

    public String[] solution(String[][] tickets) {
        this.tickets = tickets;
        
        String[] route = new String[tickets.length + 1];
        route[0] = "ICN";
        
        dfs("ICN", route, 1);

        routeList.sort((a, b) -> {
            for (int i = 0; i < a.length; i++) {
                int result = a[i].compareTo(b[i]);

                if (result != 0) {
                    return result;
                }
            }
            return 0;
        });

        return routeList.get(0);
    }

    void dfs(String current, String[] currentRoute, int index) {
        if (usedList.size() == tickets.length) {
            routeList.add(currentRoute.clone());
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i][0].equals(current)) {
                if (!usedList.contains(tickets[i])) {
                    usedList.add(tickets[i]);
                    currentRoute[index] = tickets[i][1];

                    dfs(tickets[i][1], currentRoute, index + 1);

                    currentRoute[index] = null;
                    usedList.remove(tickets[i]);
                }
            }
        }
    }
}