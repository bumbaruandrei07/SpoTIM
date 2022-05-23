package clubs;

import java.util.Arrays;

public class SportClub {

    SportTeam[] sportTeams;
    private String name;
    private int foundingYear;

    public SportClub(int capacity, String name, int foundingYear) {
        this.name = name;
        this.foundingYear = foundingYear;
        if (capacity > 0) {
            sportTeams = new SportTeam[capacity];
        }

    }

    public void addTeam() {
        for (int i = 0; i < sportTeams.length; i++) {
           //
        }
    }

    @Override
    public String toString() {
        return "Team: " + Arrays.toString(sportTeams) + "\n" + "Team name: " + name + "\n" + "Founding year: " + foundingYear;
    }
}
