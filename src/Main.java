import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fnaticMembers = new ArrayList<>(Arrays.asList("Wunder", "Razork", "Humanoid", "Upset", "Hylissang"));
        ArrayList<String> g2Members = new ArrayList<>(Arrays.asList("BrokenBlade", "Jankos", "Caps", "Flakked", "Targamas"));
        ArrayList<String> astralisMembers = new ArrayList<>(Arrays.asList("Vizicsacsi", "Xerxe", "Dajor", "Kobbe", "JeongHoon"));
        ArrayList<String> randomMembers = new ArrayList<>(Arrays.asList("Béla", "Mici", "Sanya", "Elemér", "Ödön"));

        League<LeagueOfLegendsTeam> lec = new League<>("League of Legends European Championship");
        LeagueOfLegendsTeam fnatic = new LeagueOfLegendsTeam("Fnatic", fnaticMembers);
        LeagueOfLegendsTeam g2 = new LeagueOfLegendsTeam("G2", g2Members);
        LeagueOfLegendsTeam astralis = new LeagueOfLegendsTeam("Astralis", astralisMembers);
        LeagueOfLegendsTeam random = new LeagueOfLegendsTeam("Random", randomMembers);

        League<HandballTeam> hbl = new League<>("Handball League");
        HandballTeam fncHball = new HandballTeam("Fnatic Handball", fnaticMembers);
        HandballTeam g2Hball = new HandballTeam("G2 Handball", g2Members);

        League<FootballTeam> pfbl = new League<>("Professional Football League");
        FootballTeam astFball = new FootballTeam("Astralis Football", astralisMembers);
        FootballTeam bestTeamEver = new FootballTeam("Best Team Ever", randomMembers);

        fnatic.addResults(3, 0, 0);
        g2.addResults(1, 2, 0);
        astralis.addResults(1, 2, 0);
        random.addResults(0, 0, 9);

        lec.addTeam(random);
        lec.addTeam(fnatic);
        lec.addTeam(random);
        lec.addTeam(astralis);
        lec.addTeam(g2);

        lec.printLeagueTable();

        pfbl.addTeam(astFball);
        pfbl.addTeam(bestTeamEver);
        bestTeamEver.addResults(73, 0, 0);
        astFball.addResults(72, 0, 3);

        pfbl.printLeagueTable();

        hbl.printLeagueTable();

        g2.matchResult(fnatic, 1, 0);
        lec.printLeagueTable();
    }
}