package application;

import services.ServiceLawyer;
import services.ServiceBossLawyer;
import services.ServicePerson;

import static utilities.Utility.println;
import static utilities.Utility.sc;

public class Program {
    public static void main(String[] args) {
        doFirstInteraction();
    }
    public static void doFirstInteraction(){
        println("Welcome to lawyer firm.\n");
        System.out.println("Who are you in our system?\n\n" +
                "B/b - Boss lawyer\n" +
                "L/l - A lawyer, but not the boss\n" +
                "P/p - Another person\n");
        String option = sc.nextLine();

        switch(option.toLowerCase()){
            case "b" -> {
                ServiceBossLawyer.doLoginBossLawyer();
            }
            case "l" -> {
                ServiceLawyer.doLoginLawyer();
            }
            case "p" -> {
                ServicePerson.defineTypePerson();
            }
            default -> {
               println("Option no-existent.\n");
            }
        }
    }
}