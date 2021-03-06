package main;

import clubs.SportClub;
import clubs.SportTeam;
import sporters.Basketballer;
import sporters.Footballer;
import sporters.Hockeyer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        Footballer footballer1 = new Footballer("Neymar", 1970);
        Basketballer basketballer1 = new Basketballer("LeBron James", 1985);
        Basketballer basketballer2 = new Basketballer("Paul Allen", 1987);
        Hockeyer hockeyer1 = new Hockeyer("Tyran Uilus", 1990);
        Hockeyer hockeyer2 = new Hockeyer("Marius Lucian", 1990);

        SportTeam<Basketballer> basketTeam = new SportTeam("CSA", "BasketTEAM");
        basketTeam.addSporter(basketballer1);
        basketTeam.addSporter(basketballer2);

        SportClub basketClub = new SportClub("Andrei's Club", 1999);

        basketClub.addInClub(basketTeam);
        System.out.println(basketClub);
        System.out.println("==================");

        SportClub hockeyClub = new SportClub("Sertyun", 2010);
        SportTeam<Hockeyer> hockeyerSportTeam = new SportTeam<>("Jackal", "The best hockeyers are here!");
        hockeyerSportTeam.addSporter(hockeyer1);
        hockeyerSportTeam.addSporter(hockeyer2);
        hockeyClub.addInClub(hockeyerSportTeam);
        System.out.println(hockeyerSportTeam);
        System.out.println("==================");
        SportClub footbalClub = new SportClub("Football Club", 2011);
        SportTeam<Footballer> footballerSportTeam = new SportTeam("Barcelona", "Best football team");
        footballerSportTeam.addSporter(footballer1);
        System.out.println(footballer1);
        footbalClub.addInClub(footballerSportTeam);
        System.out.println(footbalClub);
        System.out.println("==================");


        List<SportClub> clubs = new ArrayList<>();
        clubs.add(basketClub);
        clubs.add(footbalClub);
        clubs.add(hockeyClub);


        clubs = SportClub.readFromBinaryFile();

        System.out.println("Doriti sa resetati aplicatia? Y/N");
        String option = sc.next();
        if (option.equalsIgnoreCase("Y")) {
            clubs.clear();
            System.out.println("Datele au fost sterse cu succes!");
        }


        SportClub.writeToBinaryFile(clubs);


    }
}
