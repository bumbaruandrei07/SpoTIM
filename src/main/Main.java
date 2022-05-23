package main;

import clubs.SportClub;
import clubs.SportTeam;
import sporters.Basketballer;
import sporters.Footballer;
import sporters.Hockeyer;

public class Main {

    public static void main(String[] args){

        Footballer footballer1 = new Footballer("Neymar", 1970);
        Basketballer basketballer1 = new Basketballer("LeBron James", 1985);
        Basketballer basketballer2 = new Basketballer("Paul Allen", 1987);
        Hockeyer hockeyer = new Hockeyer("Tyran Uilus", 1990);

        SportTeam<Basketballer> basketTeam = new SportTeam<>(11,"Steaua", 1947, "CSA", "BasketTEAM");
        basketTeam.addSporter(basketballer1);
        basketTeam.addSporter(basketballer2);

        SportClub firstClub = new SportClub(11, "Andrei's Club", 1999);
        System.out.println(firstClub);





    }
}
