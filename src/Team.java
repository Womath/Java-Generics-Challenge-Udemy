import java.util.ArrayList;

public abstract class Team implements Comparable<Team> {
    private String name;
    private ArrayList<String> players;

    private int played = 0;
    private int wins = 0;
    private int loses = 0;
    private int draws = 0;
    private int points;


    public Team(String name, ArrayList<String> players) {
        this.name = name;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public int getWins() {
        return wins;
    }

    public int getPlayed() {
        return played;
    }

    public int getLoses() {
        return loses;
    }

    public int getDraws() {
        return draws;
    }

    public ArrayList<String> getPlayers() {
        return players;
    }

    public void addResults (int wins, int loses, int draws) {
        this.wins = wins;
        this.loses = loses;
        this.draws = draws;

        this.played = wins + loses + draws;
        this.points = wins * 3 + draws;
    }

    public void matchResult(Team opponent, int ourScore, int theirScore) {

        String message;

        if (ourScore > theirScore) {
            this.wins++;
            message = " beat ";
        } else if (ourScore == theirScore) {
            this.draws++;
            message = " draw with ";
        } else {
            this.loses++;
            message = " lost to ";
        }
        played++;

        if (opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
            System.out.println(this.getName() + message + opponent.getName());
        }
    }

    @Override
    public int compareTo(Team team) {
        if (this.points > team.getPoints()) {
            return -1;
        } else if (this.points < team.getPoints()) {
            return 1;
        } else {
            if (this.wins > team.getWins()) {
                return -1;
            } else if (this.wins < team.getWins()) {
                return 1;
            } else {
                if (this.played < team.getPlayed()) {
                    return -1;
                } else if (this.played > team.getPlayed()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }
}
