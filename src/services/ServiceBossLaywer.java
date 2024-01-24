package services;

import entities.BossLaywer;

import static utilities.Utility.println;
import static utilities.Utility.sc;

public class ServiceBossLaywer {
    public static void doLoginBossLaywer(){
        int attempts = 3;
        BossLaywer bossLaywer = new BossLaywer("Douglas", "doug", "2030");
        println("Login boss laywer");

        do{
            println("Enter your username and password:\n");
            System.out.println("Username: ");
            String username = sc.nextLine();
            System.out.println("Password: ");
            String password = sc.nextLine();

            if (username.equals(bossLaywer.getUsername()) && password.equals(bossLaywer.getPassword())){
                doInteractionBossLaywer(bossLaywer);
                break;
            }
            else{
                println("Username or password not recognized.");
                attempts--;
            }
        } while(attempts > 0);
    }
    public static void doInteractionBossLaywer(BossLaywer bossLaywer){
        println("Welcome, dear " + bossLaywer.getNameLaywer());


    }
}
