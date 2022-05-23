package clubs;

import humans.Human;

import java.util.ArrayList;

public class SportTeam<E extends Human> {

    public SportClub sportClub;
    private String name;
    private String description;

    public SportTeam(int capacity, String clubName, int foundingYear, String name, String description) {
        this.name = name;
        this.description = description;
        sportClub = new SportClub(capacity, clubName, foundingYear);
    }

    private ArrayList<E> sporters = new ArrayList<>();

    public boolean addSporter(E sporter) {
        if (sporters.contains(sporter)) {
            System.out.println("Error: Sporter " + sporter.getName() + " is already in aquarium.");
            return false;
        }
        sporters.add(sporter);
        System.out.println("Sporter: " + sporter.getName() + " added into the team.");
        return true;
    }

    @Override
    public String toString() {
        String res = "";
        for (E result : sporters) {
            res += result + "\n";
        }
        return res;
    }
}
