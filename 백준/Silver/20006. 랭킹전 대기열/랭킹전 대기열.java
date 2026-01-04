import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int p = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<Player> players = new ArrayList<>();
        for (int i = 0; i < p; i++) {
            st = new StringTokenizer(br.readLine());
            int level = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            players.add(new Player(name, level));
        }

        List<Room> rooms = new ArrayList<>();

        for (Player s : players) {
            boolean isGetIn = false;

            for (Room r : rooms) {
                if (s.level >= r.minLevel && s.level <= r.maxLevel && r.people < m) {
                    r.players.add(s);
                    r.people++;
                    if (r.people == m) {
                        r.started = true;
                    }
                    isGetIn = true;
                    break;
                }
            }

            if (!isGetIn) {
                Room newRoom = new Room(s.level - 10, s.level + 10, m);
                newRoom.players.add(s);
                newRoom.people = 1;
                if (newRoom.people == m) {
                    newRoom.started = true;
                }
                rooms.add(newRoom);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Room r : rooms) {
            r.players.sort((a, b) -> a.name.compareTo(b.name));
            if (r.started) {
                sb.append("Started!\n");
            } else {
                sb.append("Waiting!\n");
            }
            for (Player s : r.players) {
                sb.append(s.level).append(" ").append(s.name).append("\n");
            }
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        System.out.print(sb);
    }

    public static class Room {
        int minLevel;
        int maxLevel;
        int capacity;
        int people;
        List<Player> players = new ArrayList<>();
        boolean started;

        public Room(int minLevel, int maxLevel, int capacity) {
            this.minLevel = minLevel;
            this.maxLevel = maxLevel;
            this.capacity = capacity;
            this.people = 0;
            this.started = false;
        }
    }

    public static class Player {
        String name;
        int level;

        public Player(String name, int level) {
            this.name = name;
            this.level = level;
        }
    }
}
