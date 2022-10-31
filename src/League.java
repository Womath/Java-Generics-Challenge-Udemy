import java.util.ArrayList;
import java.util.Collections;

public class League <T extends Team> {
    String name;
    ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<T> getLeagueTable() {
        return teams;
    }

    public boolean addTeam(T team) {
        if (teams.contains(team)) {
            System.out.println(team.getName() + " is already in the " + this.name + " league.");
            return false;
        } else {
            teams.add(team);
            return true;
        }
    }

    public boolean printLeagueTable() {
        if (teams.size() > 0) {
            Collections.sort(teams);
            System.out.println(this.name + " rankings");
            for (Team t : teams) {
                System.out.println((teams.indexOf(t) + 1) + ". " + t.getName() + " | " + t.getPoints() +
                        " points, Wins: " + t.getWins() + ", Draws: " + t.getDraws() + ", Loses: " + t.getLoses());
            }
            return true;
        } else {
            System.out.println("There are no teams in " + this.name);
            return false;
        }
    }

}
