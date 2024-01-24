package services;

import entities.BossLawyer;

import static utilities.Utility.println;
import static utilities.Utility.sc;

public class ServiceBossLawyer {
    public static void doLoginBossLawyer(){
        int attempts = 3;
        BossLawyer bossLawyer = new BossLawyer("Douglas", "doug", "2030");
        println("Login boss laywer");

        do{
            println("Enter your username and password. Pay attention, you only get three chances\n");
            System.out.println("Username: ");
            String username = sc.nextLine();
            System.out.println("Password: ");
            String password = sc.nextLine();

            if (username.equals(bossLawyer.getUsername()) && password.equals(bossLawyer.getPassword())){
                doInteractionBossLawyer(bossLawyer);
                break;
            }
            else{
                println("Username or password not recognized.");
                attempts--;
            }
        } while(attempts > 0);
    }
    public static void doInteractionBossLawyer(BossLawyer bossLawyer){
        println("Welcome, dear " + bossLawyer.getNameLawyer() + "\n");
        System.out.println("Choose an option to move forwad\n" +
                "           LAWYER BOSS SERVICES\n\n" +
                "           LAWYER SERVICES\n\n" +
                "           PERSON SERVICES\n\n");

    }
}
