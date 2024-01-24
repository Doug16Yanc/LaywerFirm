package services;

import entities.BossLawyer;

import static application.Program.doFirstInteraction;
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
    public static void doInteractionBossLawyer(BossLawyer bossLawyer) {
        println("Welcome, dear " + bossLawyer.getNameLawyer() + "\n");
        int option;
        do {
            System.out.println("Choose an option to move forwad\n" +
                    "           LAWYER BOSS SERVICES\n\n" +
                    "           0 - Log out\n" +
                    "'          1 - Perform query\n" +
                    "           2 - List processes\n\n" +
                    "           LAWYER SERVICES\n\n" +
                    "           3 - Record a lawyer\n" +
                    "           4 - Query a lawyer\n" +
                    "           5 - Update data laywer\n" +
                    "           6 - List lawyers\n\n" +
                    "           PERSON SERVICES\n\n" +
                    "           7 - Query a person\n" +
                    "           8 - List persons\n");
            option = sc.nextInt();

            switch (option) {
                case 0 -> {
                    doFirstInteraction();
                    break;
                }
                case 1 -> {

                }
                case 2 -> {

                }
                case 3 -> {

                }
                case 4 -> {

                }
                case 5 -> {

                }
                case 6 -> {

                }
                case 7 -> {

                }
                case 8 -> {

                }
                default -> {
                    println("Option no-existent.\n");
                }
            }
        } while (option != 0);

    }
}
