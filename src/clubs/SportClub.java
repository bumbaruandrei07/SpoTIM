package clubs;

import java.util.ArrayList;


public class SportClub {

    ArrayList<SportTeam> sportTeams;
    private String name;
    private int foundingYear;

    public SportClub(String name, int foundingYear) {
        this.name = name;
        this.foundingYear = foundingYear;
        sportTeams = new ArrayList<>();
    }

    public void addInClub(SportTeam sportTeam) {
        if (!sportTeams.contains(sportTeam)) {
            sportTeams.add(sportTeam);
        }
    }

    @Override
    public String toString() {
        return "Teams in the club: " + sportTeams + "\n" + "Club name: " + name + "\n" + "Founding year: " + foundingYear;
    }
}
